package smartphone.phone;

public abstract class Telephone implements Phone{
    public void call(int num) {
        System.out.println("Ligando para: " + num);
    }

    public void answer() {
        System.out.println("Atendendo...");
    }
    
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz...");
    }
}
