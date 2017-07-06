package com.sandbox.app;

class Main {

  public static void main(String[] args) {
    try {
      Send.sendMessage("sup dude");
      Send.sendMessage("how are you?");
      Receive.receiveMessage();
    } catch (java.io.IOException e) {
      System.out.println("shit's broke");
    } catch (java.lang.InterruptedException e) {
      System.out.println("shit's broke");
    } catch (java.util.concurrent.TimeoutException e) {
      System.out.println("shit's broke");
    }
  }
}
