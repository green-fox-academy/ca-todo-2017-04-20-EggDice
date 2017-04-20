package todoapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eggdice on 4/20/17.
 */
public class TodoApp {
  List<Command> commands;

  public TodoApp() {
    commands = new ArrayList<Command>();
    commands.add(new ListCommand());
  }

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
    if (args.length == 0) {
      return runUsage();
    }
    for (Command command : commands) {
      if (("-" + command.getFlag()).equals(args[0])) {
        return command.execute();
      }
    }
    return "";
  }
}
