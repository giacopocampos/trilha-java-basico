import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da sua conta bancária:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();
      
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque." );
        
        scanner.close();
    }

}