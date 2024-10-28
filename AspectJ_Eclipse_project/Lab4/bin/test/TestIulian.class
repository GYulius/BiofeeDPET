package test;
import singleton.Database;
import strategy.TremorDetector;

public class TestIulian {
	public static void main(String []args) {
		Database d = Database.getInstance();
		d. connect();
		d.disconnect();
		
		TremorDetector t = new TremorDetector();
		t.setStrategy(null);
		t.analyzeData();
		
	}
}
