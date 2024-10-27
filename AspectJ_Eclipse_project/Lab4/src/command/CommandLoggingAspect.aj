
package command;

//Aspect to log command execution
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CommandLoggingAspect {
 @Before("execution(* Command.execute(..))")
 public void logCommandExecution() {
     System.out.println("Command is about to be executed.");
 }
}