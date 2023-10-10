public class Escola {
    public static void main(String[] args) {
        Aluno david = new Aluno();

        david.setNome("David William");
        david.setIdade(26);

        System.out.println("O aluno " + david.getNome() + " tem " + david.getIdade() + " anos.");
    }
}
