import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {

            System.out.println("O segundo parametro deve ser menor que o primeiro!");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {

        if(parametroUm > parametroDois) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
