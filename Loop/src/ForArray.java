public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"Alexandre", "Bianca", "David", "Paloma", "Victoria"};

        for(int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do índice " + i + " é " + alunos[i]);
        }

        for(String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
