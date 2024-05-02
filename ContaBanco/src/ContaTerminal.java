import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroAgencia;
        String nomeCliente, nomeAgencia;
        double saldo;
        Scanner x = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = x.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        numeroAgencia = x.nextInt();
        
        System.out.println("Por favor, digite o nome da Agência:");
        nomeAgencia = x.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = x.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
        }
}