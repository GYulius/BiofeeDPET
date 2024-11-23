package ro.gilian.biofeed.sensorswatch

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.wearable.*
import kotlinx.coroutines.launch
import ro.gilian.biofeed.R

class MainActivity : ComponentActivity(), SensorEventListener {

    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var gyroscope: Sensor? = null

    private val accelData = MutableLiveData<FloatArray>()
    private val gyroData = MutableLiveData<FloatArray>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize SensorManager
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        gyroscope = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)

        // Observe accelerometer data
        accelData.observe(this, Observer { data ->
            sendDataToPhone("ACCELEROMETER", data)
        })

        // Observe gyroscope data
        gyroData.observe(this, Observer { data ->
            sendDataToPhone("GYROSCOPE", data)
        })
    }

    override fun onResume() {
        super.onResume()
        accelerometer?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
        gyroscope?.let {
            sensorManager.registerListener(this, it, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        event?.let {
            when (it.sensor.type) {
                Sensor.TYPE_ACCELEROMETER -> accelData.value = it.values
                Sensor.TYPE_GYROSCOPE -> gyroData.value = it.values
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        // Handle accuracy changes if needed
    }

    private fun sendDataToPhone(sensorType: String, values: FloatArray) {
        lifecycleScope.launch {
            val dataClient = Wearable.getDataClient(this@MainActivity)
            val dataMap = DataMap().apply {
                putString("sensorType", sensorType)
                putFloatArray("values", values)
                putLong("timestamp", System.currentTimeMillis())
            }

            val putDataRequest = PutDataMapRequest.create("/sensor_data").apply {
                dataMap.putAll(this.dataMap)
            }.asPutDataRequest()

            dataClient.putDataItem(putDataRequest)
        }
    }
}
