// Aspect to log observer notifications
package observer;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ObserverNotificationAspect {
    @Before("execution(* Subject.notifyObservers(..))")
    public void logObserverNotification() {
        System.out.println("Notifying observers of a tremor change.");
    }
}