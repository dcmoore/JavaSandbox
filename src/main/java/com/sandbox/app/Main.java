package com.sandbox.app;

class Main {

  public static void main(String[] args) {
    try {
      switch(args[0]) {
        case "send":
          System.out.println("Type a message, then hit enter to send:");
          String message = System.console().readLine();
          Send.sendMessage(message);
          System.out.println("Success!!!");
          break;
        case "receive":
          Receive.receiveMessage();
          break;
      }
    } catch (java.io.IOException|java.lang.InterruptedException|java.util.concurrent.TimeoutException e) {
      System.out.println("everything is broken");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      System.out.println("Specify 'send' or 'receive'");
    }
  }
}
