import java.util.Random;

class Main {
  public static void doStuff(String s, Double... a) {
    System.out.println(a.length);
  }

  public static void main(String[] args) {
    System.out.println(new Thing("sup"));
    doStuff("sup", 1.0, 2.0, 3.0);
  }
}


class Thing {
  private String message;

  public Thing() {
    new Thing("it works");
  }

  public Thing(String message) {
    this.message = message;
  }

  public String toString() {
    return "sup dawg from Thing! " + message;
  }
}
