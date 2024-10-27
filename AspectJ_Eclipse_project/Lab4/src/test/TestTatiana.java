package test;
import factory.SmartwatchFactory;
import factory.Data;
import observer.TremorDetector;

public class TestTatiana {
	public static void main(String []args) {
		SmartwatchFactory s = new SmartwatchFactory();
		Data d;
		d = s.createData(null);
		
		
		
		TremorDetector td = new TremorDetector();
		boolean isTremorDetected;
		td.registerObserver(null);
		td.removeObserver(null);
		td.notifyObservers();
		isTremorDetected = td.isTremorDetected();
		
	}
}
