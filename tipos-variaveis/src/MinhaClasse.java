import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        /*String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);

        System.out.println("Tenho " + idade + " anos ");

        System.out.println("Minha altura é " + altura + "cm ");*/

        // criando o objeto scanner
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);

        System.out.println("Tenho " + idade + " anos ");

        System.out.println("Minha altura é " + altura + "cm ");

    }

}