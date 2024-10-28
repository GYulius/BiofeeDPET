
package singleton;

// Aspect to log database access
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DatabaseAccessAspect {
    @Before("execution(* Database.getInstance(..))")
    public void logDatabaseAccess() {
        System.out.println("Accessing the database instance.");
    }
}