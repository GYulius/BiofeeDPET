
package state;

//Aspect to log state transitions
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StateTransitionAspect {
 @Before("execution(* TremorDetector.setState(..))")
 public void logStateTransition() {
     System.out.println("State is being changed.");
 }
}