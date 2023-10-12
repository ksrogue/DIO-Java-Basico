package smartphone.webBrowser;

public abstract class WebBrowser {
    public void showPage() {
        System.out.println("Mostrando a página de web.");
    }

    public void addNewPage() {
        System.out.println("Adicionando nova aba.");
    }

    public void refreshPage() {
        System.out.println("Recarregando página.");
    }
}
