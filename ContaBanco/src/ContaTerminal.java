import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao PurinBank! Seu depósito na conta em segundos.");

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome);

        System.out.print("Digite a agência com o digito: ");
        String agencia = scanner.nextLine();
        System.out.println("Ag.: " + agencia);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Você digitou: " + numeroConta);

        System.out.print("Quanto deseja depositar? ");
        double saldo = scanner.nextDouble();
        System.out.println("Saldo atual: " + saldo);

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo de R$ "+ saldo +" já está disponível para saque.");

        scanner.close();
    }
}
