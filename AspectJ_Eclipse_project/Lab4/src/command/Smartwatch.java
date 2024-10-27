

package command;

//Smartwatch Class (Invoker)
public class Smartwatch {
 private Command command1, command2;

 public void setCommand(Command command) { if(command1 == null) command1 = command; else command2 = command; }
 public void pressButton(boolean ok) { if(ok) command1.execute(); else command2.execute(); }
}

