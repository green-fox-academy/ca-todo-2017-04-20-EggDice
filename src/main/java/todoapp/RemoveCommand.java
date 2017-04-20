package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public class RemoveCommand extends Command{
  RemoveCommand() {
     super("r", "Removes an task");
  }

  @Override
  public String execute() {
    return "";
  }
}
