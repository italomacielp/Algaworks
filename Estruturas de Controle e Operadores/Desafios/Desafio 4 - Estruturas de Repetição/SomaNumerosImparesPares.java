import java.util.Scanner;

public class SomaNumerosImparesPares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again = true;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;

        do {
            System.out.println("Enter a number");
            int number = in.nextInt();
            if(number % 2 == 0){
                sumEvenNumber += number;
            } else {
                sumOddNumber += number;
            }

            in.nextLine();
            System.out.println("Do you want enter a number again? (y/n)");
            char value = in.nextLine().charAt(0);
            again = value == 'y' ? true : false;
        } while(again);

        System.out.printf("The even sum was %d%nThe odd sum was %d%n", sumEvenNumber, sumOddNumber);
    }

}