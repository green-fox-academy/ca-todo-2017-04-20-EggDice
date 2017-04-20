package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public abstract class Command {
  private String flag;

  Command(String flag) {
    this.flag = flag;
  }

  public abstract String execute();

  public String getFlag() {
    return flag;
  }
}
