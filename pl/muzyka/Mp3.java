package pl.muzyka;

public class Mp3 extends MusicPlayer implements InterPlayer {
    public Mp3(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("MP3 play  " + getCurrentSong());

    }

    @Override
    public void pause() {
        System.out.println("MP3 pauza" + getCurrentSong());

    }

    @Override
    public void stop() {
        System.out.println("MP3 stop" + getCurrentSong());

    }

    @Override
    public void next() {
        System.out.println("MP3 następny utwór" + getCurrentSong());

    }

    @Override
    public void previous() {
        System.out.println("MP3 poprzedni utwór" + getCurrentSong());

    }
}
