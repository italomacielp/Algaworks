import java.util.Scanner;

public class CalculatorIMC {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("What your height?");
  double height = in.nextDouble();

  System.out.println("What your weight?");
  double weight = in.nextDouble();

  in.nextLine();

  System.out.println("What's woman or man? Respond (w/m)");
  char gender = in.nextLine().charAt(0);

  double imc = weight / (height * height);

  if(gender == 'w') {
    if(imc < 19.1) {
      System.out.println("Underweight");
    } else if(imc >= 19.1 && imc <= 25.8) {
      System.out.print("At ideal weight");
    } else if(imc >= 25.9 && imc <= 27.3) {
      System.out.print("A little overweight");
    } else if(imc >= 27.4 && imc <= 32.3) {
      System.out.print("Above ideal weight");
    } else {
      System.out.print("Obese");
    }
  } else {
    if(imc < 20.7) {
      System.out.println("Underweight");
    } else if(imc >= 20.8 && imc <= 26.4) {
      System.out.print("At ideal weight");
    } else if(imc >= 26.5 && imc <= 27.8) {
      System.out.print("A little overweight");
    } else if(imc >= 27.9 && imc <= 31.1) {
      System.out.print("Above ideal weight");
    } else {
      System.out.print("Obese");
    }
  }
  
  in.close();

 }
}