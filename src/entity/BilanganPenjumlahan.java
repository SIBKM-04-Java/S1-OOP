package entity;

public class BilanganPenjumlahan implements Bilangan {

  @Override
  public int penjumlahan(int a, int b) {
    return a + b;
  }

  @Override
  public String printNameorAge(Person person) {
    return person.getName();
  }
}
