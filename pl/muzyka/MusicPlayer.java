package pl.muzyka;

abstract class MusicPlayer implements InterPlayer  {
    private Song [] library;
    private int current;
    private int status;


    public MusicPlayer(Song[] library) {
        this.library = library;
    }

    public Song getCurrentSong () {
        return library [current];
    }

    public void next() {
        if (++current >= library.length) {
            current = 0;
        };
        play();


    }


    public void previous() {
        if (--current < 0) {
            current = library.length;
        }
        ;
        play();
    }
}
