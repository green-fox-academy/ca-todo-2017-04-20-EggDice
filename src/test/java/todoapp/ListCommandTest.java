package todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by eggdice on 4/20/17.
 */
public class ListCommandTest {
  @Test
  public void returnEmptyMessage() {
    ListCommand command = new ListCommand();
    assertEquals("No todos for today! :)", command.execute());
  }

  @Test
  public void lFlag() {
    ListCommand command = new ListCommand();
    assertEquals("l", command.getFlag());
  }
}