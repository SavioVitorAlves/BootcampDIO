import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo ao Banco DIO!");
        
        System.out.println("Digite o numero da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o sua Argencia: ");
        String argencia = scanner.next();
        System.out.println("Digite a seu Nome: ");
        String nome = scanner.next();
        System.out.println("Digite a sua Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Numero da Conta: "+numero);
        System.out.println("Argencia: "+argencia);
        System.out.println("Nome do Cliente: "+nome);
        System.out.println("Saldo: "+saldo);

    }
}
