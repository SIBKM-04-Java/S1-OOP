package entity;

public class Manager extends Employee {

  private String division;

  public Manager() {}

  public Manager(
    String name,
    Integer age,
    Integer salary,
    String jobTitle,
    String division
  ) {
    super(name, age, salary, jobTitle);
    this.division = division;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  @Override
  public void perkenalanDiri() {
    super.perkenalanDiri();
    System.out.println("Divisi saya adalah = " + getDivision());
  }
}
