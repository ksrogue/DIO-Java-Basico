package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural no balcão.");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão.");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche() {
        System.out.println("Preparando lanche natural.");
    }

    public void prepararSuco() {
        System.out.println("Preparando suco.");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }
}
