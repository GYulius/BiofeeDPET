package test;
import command.TurnOffAlert;
import command.TurnOnAlert;
import command.Smartwatch;
import command.Feedback;
import state.TremorDetector;
import state.NormalState;

public class TestCristian {
	public static void main(String []args) {
		Smartwatch s = new Smartwatch();
		Feedback fok = new Feedback();
		fok.setOk(true);
		Feedback fnotok = new Feedback();
		fnotok.setOk(false);
		TurnOffAlert toff = new TurnOffAlert(fok);
		TurnOnAlert ton = new TurnOnAlert(fnotok);
		s.setCommand(ton);
		s.setCommand(toff);
		s.pressButton(false);
		
		
		TremorDetector td = new TremorDetector();
		NormalState ns = new NormalState();
		td.setState(ns);
		
	}
}
