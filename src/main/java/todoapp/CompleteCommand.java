package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public class CompleteCommand extends Command {
  CompleteCommand() {
    super("c", "Completes an task");
  }

  @Override
  public String execute() {
    return "";
  }
}
