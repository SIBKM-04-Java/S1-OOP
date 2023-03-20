package entity;

public abstract class BidangDatar {

  int sisi = 2;

  public void printAtribut() {
    System.out.println("Atribut sisi = " + sisi);
  }

  abstract int luas();

  abstract int keliling();
}
