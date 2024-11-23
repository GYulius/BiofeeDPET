package ro.gilian.biofeed.sensorsphone

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.google.android.gms.wearable.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement

class WearDataListenerService : LifecycleService(), DataClient.OnDataChangedListener {

    override fun onCreate() {
        super.onCreate()
        Wearable.getDataClient(this).addListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        Wearable.getDataClient(this).removeListener(this)
    }

    override fun onDataChanged(dataEvents: DataEventBuffer) {
        for (event in dataEvents) {
            if (event.type == DataEvent.TYPE_CHANGED) {
                val path = event.dataItem.uri.path
                if (path == "/sensor_data") {
                    val dataMap = DataMapItem.fromDataItem(event.dataItem).dataMap
                    val sensorType = dataMap.getString("sensorType")
                    val values = dataMap.getFloatArray("values")
                    val timestamp = dataMap.getLong("timestamp")

                    CoroutineScope(Dispatchers.IO).launch {
                        if (sensorType != null) {
                            if (values != null) {
                                saveToDatabase(sensorType, values, timestamp)
                            }
                        }
                    }
                }
            }
        }
    }

    private fun saveToDatabase(sensorType: String, values: FloatArray, timestamp: Long) {
        val url = "jdbc:postgresql://<DB_HOST>:<DB_PORT>/<DB_NAME>"
        val user = "<DB_USER>"
        val password = "<DB_PASSWORD>"

        val connection: Connection
        val statement: PreparedStatement

        try {
            connection = DriverManager.getConnection(url, user, password)
            val sql = "INSERT INTO sensor_data (sensor_type, x, y, z, timestamp) VALUES (?, ?, ?, ?, ?)"
            statement = connection.prepareStatement(sql).apply {
                setString(1, sensorType)
                setFloat(2, values[0])
                setFloat(3, values[1])
                setFloat(4, values[2])
                setLong(5, timestamp)
            }
            statement.executeUpdate()
            statement.close()
            connection.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
