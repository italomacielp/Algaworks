import java.util.Scanner;

public class FolhaPagamento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = entrada.nextLine();
    
    System.out.print("Valor por hora: ");
    double valorPerHora = entrada.nextDouble();
    
    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = entrada.nextInt();

    System.out.print("Valor dos descontos: ");
    double valorDesconto = entrada.nextDouble();

    double totalSemDesconto = valorPerHora * horasTrabalhadas;
    double totalComDesconto = totalSemDesconto - valorDesconto;

    System.out.printf("%nFolha de Pagamento: %s%n %d horas x R$%.2f = R$%.2f%n Descontos: R$%.2f%n Total devido: R$%.2f", nome, horasTrabalhadas, valorPerHora, totalSemDesconto, valorDesconto, totalComDesconto);

  }

}
