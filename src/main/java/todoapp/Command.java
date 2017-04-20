package todoapp;

/**
 * Created by eggdice on 4/20/17.
 */
public abstract class Command {
  private String flag;
  private String usageDescription;

  Command(String flag, String usageDescription) {
    this.flag = flag;
    this.usageDescription = usageDescription;
  }

  public abstract String execute();

  public String getFlag() {
    return flag;
  }

  public String getUsage() {
    return " -" + flag + "   " + usageDescription;
  }
}
