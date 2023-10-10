public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadosBrasileiro e: EstadosBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        EstadosBrasileiro eb = EstadosBrasileiro.BAHIA;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
