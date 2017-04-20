package todoapp;
/**
 * Created by eggdice on 4/20/17.
 */
public class TodoApp {
  public String runUsage() {
    return "Python Todo application\n" +
           "=======================\n" +
           "Command line arguments:\n" +
           " -l   Lists all the tasks\n" +
           " -a   Adds a new task\n" +
           " -r   Removes an task\n" +
           " -c   Completes an task";
  }

  public String run(String[] args) {
    if (args.length > 0) {
      return "No todos for today! :)";
    }
    return runUsage();
  }
}
