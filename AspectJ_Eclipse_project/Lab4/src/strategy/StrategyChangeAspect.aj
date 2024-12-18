package strategy;

// Aspect for strategy change
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StrategyChangeAspect {
	@Before("execution(* TremorDetector.setStrategy(..))")
	public void logStrategyChange() {
		System.out.println("Strategy for tremor detection is being changed.");
	}
}