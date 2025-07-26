import java.util.Scanner;

public class NumerosPares {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number, totalSum = 0;

    for(int i = 1; i <= 10; i++) {
   	System.out.println("Enter a number:");
        number = in.nextInt();
        
        if(number % 2 != 0) {
          System.out.printf("The number %d isn't even, type it again.%n", number);
          continue;
        }
        totalSum += number;
    }

    System.out.printf("Total sum: %d%n", totalSum);
	
  }
 
}