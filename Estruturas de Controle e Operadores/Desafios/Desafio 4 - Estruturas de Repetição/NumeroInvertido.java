import java.util.Scanner;

public class NumeroInvertido {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt();
        int rest = number % 10;
        int newNumber = number / 10;
        int numberInverted = rest;

        while(newNumber != 0) {
            System.out.println("NumberInverted: " + rest);
            rest = newNumber % 10;
            newNumber /= 10;

            numberInverted = numberInverted * 10 + rest;
        }

        System.out.printf("The inversion of the number %d is %d%n", number, numberInverted);
    }

}