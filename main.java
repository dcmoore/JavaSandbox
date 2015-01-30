//Example for Brian

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first integer: ");
        int int1 = input.nextInt();
        System.out.printf("Enter second integer: ");
        int int2 = input.nextInt();
        int sum = int1 + int2;
        int difference = int1 - int2;
        int product = int1 * int2;
        int quotient = int1 / int2;

        System.out.println(int1 + " + " + int2 + " = " + sum);
    }
}
