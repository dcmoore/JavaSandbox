class Main {
  public static void main(String[] args) {
    Integer thing = 0;
    Integer otherThing = null;
    try {
      thing += otherThing;
    } catch (NullPointerException e) {
      System.out.println("And that kids is how you create a null pointer exception.");
    }
  }
}
