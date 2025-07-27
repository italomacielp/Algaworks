import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = in.nextInt();
        int count = 0;

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                count++;
            }
        }

        if(count == 2)
            System.out.printf("The number %d is prime number. %n", number);
        else
            System.out.printf("The number %d isn't prime number. %n", number);
    }

}