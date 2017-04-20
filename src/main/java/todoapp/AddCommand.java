package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public class AddCommand extends Command{
   AddCommand() {
     super("a", "Adds a new task");
   }

   @Override
   public String execute() {
     return "";
   }
}
