package entity;

public class Employee extends Person {

  private Integer salary;
  private String jobTitle;

  public Employee() {}

  public Employee(String name, Integer age, Integer salary, String jobTitle) {
    super(name, age);
    this.salary = salary;
    this.jobTitle = jobTitle;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  @Override
  public void perkenalanDiri() {
    super.perkenalanDiri();
    System.out.println("Gaji saya adalah = " + getSalary());
    System.out.println("Jabatan saya adalah = " + getJobTitle());
  }

  @Override
  public String toString() {
    return "Employee = name: " + getName();
  }
}


// String name; = attribut
// String toString(){} = method