import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
            

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + "sobrenome");
        }
        } catch (InputMismatchException e) {
            System.out.println("O campo de idade precisa ser numérico.");
        }


    }
}
