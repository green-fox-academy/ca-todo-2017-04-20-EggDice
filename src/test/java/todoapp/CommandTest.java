package todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eggdice on 4/20/17.
 */

class ChildCommand extends Command {
   ChildCommand() {
     super("w");
   }

   @Override
   public String execute() {
     return "";
   }
}


public class CommandTest {

  @Test
  public void getFlag() {
    ChildCommand command = new ChildCommand();
    assertEquals("w", command.getFlag());
  }
}