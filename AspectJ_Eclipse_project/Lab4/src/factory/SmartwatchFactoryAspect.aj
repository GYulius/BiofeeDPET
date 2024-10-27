
package factory;

// Aspect to log factory creation
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SmartwatchFactoryAspect {
    @Before("execution(* SmartwatchFactory.createData(..))")
    public void logDataCreation() {
        System.out.println("Creating a new data instance.");
    }
}