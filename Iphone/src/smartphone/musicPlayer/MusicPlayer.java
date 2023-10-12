package smartphone.musicPlayer;

public abstract class MusicPlayer implements Player {
    protected String music;

    public MusicPlayer(String music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Tocando: " + music);
    }

    public void pause() {
        System.out.println("A musica foi pausada.");
    }

    public void selectMusic(String music) {
        this.music = music;
        System.out.println(music + " foi selecionada.");
    }

    public String getMusic() {
        return music;
    }

}
