public enum EstadosBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    BAHIA ("BA", "BAHIA"),
    RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul"),
    AMAZONAS ("AM", "AMAZONAS");


    private String nome;
    private String sigla;

    private EstadosBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
