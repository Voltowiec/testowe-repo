package pl.muzyka;

import java.lang.management.PlatformLoggingMXBean;

public class CD extends MusicPlayer implements InterPlayer {
    public CD(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza");

    }

    @Override
    public void pause() {
        System.out.println("Cd pauza");

    }

    @Override
    public void stop() {
        System.out.println("Cd stop");

    }



}
