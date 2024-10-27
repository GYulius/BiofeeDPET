

package command;


//Command Implementation: TurnOffAlert
public class TurnOffAlert implements Command {
 private Feedback feedback;

 public TurnOffAlert(Feedback feedback) {
     this.feedback = feedback;
 }

 public void execute() { /* No functionality here */ }
}

