package todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eggdice on 4/20/17.
 */
public class TodoAppTest {
  @Test
  public void returnUsage() {
    TodoApp app = new TodoApp();
    String usage = app.runUsage();
    String expectedUsage =
            "Python Todo application\n" +
            "=======================\n" +
            "Command line arguments:\n" +
            " -l   Lists all the tasks\n" +
            " -a   Adds a new task\n" +
            " -r   Removes an task\n" +
            " -c   Completes an task";

    assertEquals(usage, expectedUsage);
  }
}