import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ExemploExcecao {
    public static void main(String[] args) {
    try{    
        //criando o objeto scaner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobreNome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura");
    double altura = scanner.nextDouble();

    //imprimindo os dados obtidos pelo usuario
    System.out.println("Ola, me chamo " + nome.toUpperCase() + " "+ sobreNome.toUpperCase());
    System.out.println("Tenho " + idade + " anos");
    System.out.println(("Minha altura é " + altura + "cm"));
    scanner.close();
    }
    catch (InputMismatchException e){
        System.err.println("Os campos idade e altura devem ser numéricos");
    }
   }

}
