import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o Número: ");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite seu Nome: ");
            String nome = scanner.next();
            
            System.out.println("Por favor, digite seu Saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );
        }
    }
}
