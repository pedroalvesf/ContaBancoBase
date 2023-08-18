import java.util.Scanner;

public class Conta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome;
    System.out.println("Digite o seu nome: ");
    nome = scanner.nextLine();

    System.out.println("Digite a sua agencia: ");
    String agencia = scanner.nextLine();

    System.out.println("Digite o seu numero: ");
    int numero = scanner.nextInt();

    System.out.println("Digite o seu saldo: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia
        + ", conta " + numero + " e seu saldo: R$" + saldo + " já está disponível para saque");

    scanner.close();
  }
}