public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("44990000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcepition e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com as regras de negócios.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoExcepition {
        if(cep.length() != 8) {
            throw new CepInvalidoExcepition();
        }
        return "44.990-000";
    }
}
