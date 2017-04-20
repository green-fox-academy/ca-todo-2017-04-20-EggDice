package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public class ListCommand extends Command {
  ListCommand() {
    super("l", "Lists all the tasks");
  }

  public String execute() {
    return "No todos for today! :)";
  }
}
