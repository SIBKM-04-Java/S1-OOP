package entity;

public class Persegi extends BidangDatar {

  @Override
  public int keliling() {
    return 4 * sisi;
  }

  @Override
  public int luas() {
    return sisi * sisi;
  }
}
