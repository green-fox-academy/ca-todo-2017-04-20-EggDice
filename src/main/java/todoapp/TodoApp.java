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
    commands.add(new AddCommand());
    commands.add(new RemoveCommand());
    commands.add(new CompleteCommand());
  }

  public String runUsage() {
    String usage = "Python Todo application\n" +
            "=======================\n" +
            "Command line arguments:\n";
    for (Command command : commands) {
      usage += command.getUsage() + "\n";
    }
    return usage;
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
