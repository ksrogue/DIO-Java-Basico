package smartphone;

import smartphone.musicPlayer.Player;
import smartphone.phone.Phone;
import smartphone.webBrowser.Browser;

public class Iphone implements Player, Phone, Browser {

    @Override
    public void play() {
        System.out.println("Tocando");
    }

    @Override
    public void pause() {
        System.out.println("A musica foi pausada.");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println(music + " foi selecionada.");
    }

    @Override
    public void call(int num) {
        System.out.println("Ligando para " + num);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void showPage() {
        System.out.println("Mostrando a página de web.");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Recarregando página.");
    }

    public static void main(String[] args) {
        Iphone iphoneX = new Iphone();

        iphoneX.selectMusic("So Far Away");
        iphoneX.play();
        iphoneX.pause();

        iphoneX.call(99885533);
        iphoneX.answer();
        iphoneX.startVoiceMail();

        iphoneX.showPage();
        iphoneX.addNewPage();
        iphoneX.refreshPage();
    }
}
