package List;

import entity.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1 {

  // Static Array
  public void staticArray() {
    int[] numbers = new int[5];
    numbers[2] = 24;
    // System.out.println(numbers[2]);

    numbers = new int[6]; //re-assign
    String[] words = { "Hello", "Teman-Teman", "SIBKM" };
    System.out.println(words.length);
  }

  // Dinamic Array
  public void dinamicArray() {
    List<String> names = new ArrayList<>();
    names.add("Fuad");
    // System.out.println(names.size());
    System.out.println(names.get(0));
  }

  // Static Array base Object
  public void staticArray2() {
    // int[] numbers = new int[5];
    Person[] persons = new Person[3];

    // cara 1
    Person person1 = new Person();
    person1.setName("Budi");
    person1.setAge(20);
    persons[0] = person1;

    // cara 2
    Person person2 = new Person("Doni", 21);
    persons[1] = person2;

    // cara 3
    persons[2] = new Person("Wati", 22);

    for (Person person : persons) {
      System.out.println(person.getName() + ", " + person.getAge());
      // person.perkenalanDiri();
    }
  }

  // Dinamic Array base Object
  public void dinamicArray2() {
    List<Person> persons = new ArrayList<>();
    persons =
      Arrays.asList(
        new Person[] {
          new Person("Teguh", 20),
          new Person("Cahyo", 19),
          new Person("Ghandi", 17),
          new Person("Noami", 15),
          new Person("Sarif", 18),
        }
      );

    // # cara 1
    // for (Person person : persons) {
    //   System.out.println(person.getName() + ", " + person.getAge());
    // }

    // # cara 2
    // for (int i = 0; i < persons.size(); i++) {
    //   System.out.println(
    //     persons.get(i).getName() + ", " + persons.get(i).getAge()
    //   );
    // }

    // # cara 3
    // persons.forEach(person ->
    //   System.out.println(person.getName() + ", " + person.getAge())
    // ); // single statement

    // persons.forEach(System.out::println); // method reference

    // persons.forEach(person -> {
    //   if (person.getAge() > 17) {
    //     System.out.println(person.getName() + ", " + person.getAge());
    //   }
    // }); // block statement

    // # cara 4
    persons
      .stream()
      .filter(person -> person.getAge() < 17)
      .map(person -> person.getName() + " " + person.getAge())
      .forEach(System.out::println);
  }

  public static void main(String[] args) {
    List1 list1 = new List1();

    // list1.staticArray();
    // list1.dinamicArray();
    // list1.staticArray2();
    list1.dinamicArray2();
  }
}
