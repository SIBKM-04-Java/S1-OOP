package entity;

public class NewPerson extends Person {

  boolean isOld;

  public NewPerson(boolean isOld) {
    this.isOld = isOld;
  }

  public NewPerson(boolean isOld, String name, Integer age) {
    super(name, age);
    this.isOld = isOld;
  }

  public boolean isOld() {
    return isOld;
  }

  public void setOld(boolean isOld) {
    this.isOld = isOld;
  }
}
