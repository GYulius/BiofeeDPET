

package command;


//Command Implementation: TurnOnAlert
public class TurnOnAlert implements Command {
 private Feedback feedback;

 public TurnOnAlert(Feedback feedback) {
     this.feedback = feedback;
 }

 public void execute() { /* No functionality here */ }
}


