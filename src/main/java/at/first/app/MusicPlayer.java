package at.first.app;

public class MusicPlayer {
    private Music music;

    // IoC = Inversion of control
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
