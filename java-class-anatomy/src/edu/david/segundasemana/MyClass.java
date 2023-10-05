package edu.david.segundasemana;
public class MyClass {
    public static void main(String[] args) {
        String primeiroNome = "David William";
        String segundoNome = "dos Santos";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Seu nome é: " + primeiroNome + " " + segundoNome;
    }
}
