import entity.BidangDatar;
import entity.BilanganPenjumlahan;
import entity.Employee;
import entity.Manager;
import entity.Persegi;
import entity.Person;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println();

    Person person = new Person();
    // person.setName("fuad");
    // person.setAge(20);

    // person.perkenalanDiri();

    // ==========================

    Employee emp = new Employee();
    emp.setName("Budi");
    emp.setAge(20);
    emp.setSalary(1000);
    emp.setJobTitle("Employee");

    // emp.perkenalanDiri();

    // System.out.println(emp);

    BilanganPenjumlahan tambah = new BilanganPenjumlahan();

    // System.out.println(tambah.penjumlahan(2, 2));
    System.out.println(tambah.printNameorAge(person));

    Persegi persegi = new Persegi();
    // persegi.printAtribut();

    // System.out.println("luas persegi = " + persegi.luas());
    // System.out.println("keliling persegi = " + persegi.keliling());

    // Manager manager = new Manager();

    // manager.setName("Doni");
    // manager.setAge(20);
    // manager.setJobTitle("Manager");
    // manager.setSalary(10000);
    // manager.setDivision("HR");

    // manager.perkenalanDiri();
  }
}
