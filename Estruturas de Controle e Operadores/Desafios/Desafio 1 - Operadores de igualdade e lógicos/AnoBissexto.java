import java.util.Scanner;

public class AnoBissexto {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ano: ");
    int ano = entrada.nextInt();
    
    boolean isBissexto = (ano % 4 == 00 && !(ano % 100 == 0));

    System.out.printf("Ano é bissexto? %b%n", isBissexto);

  }

}
