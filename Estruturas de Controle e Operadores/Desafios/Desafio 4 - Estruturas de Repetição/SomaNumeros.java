import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while(true) {
            System.out.println("Enter a number");
            int number = in.nextInt();

            sum += number;
            if(sum >= 100)
                break;
        }

        System.out.printf("Total sum: %d", sum);
    }

}