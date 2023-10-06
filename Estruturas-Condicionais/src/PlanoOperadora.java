public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch(plano) {
            case "B": {
                System.out.println("100 minutos de ligação");
            }
            case "M": {
                System.out.println("+ whatsapp e instagram grátis");
            }
            case "T": {
                System.out.println("+ 5GB de youtube");
            }
        }
    }
}
