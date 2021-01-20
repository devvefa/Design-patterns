package com.company.Structural.bridge.bridge.musicplayer;

import com.company.Structural.bridge.bridge.Song;

public class Fizy implements  IMusicPlayer{
    @Override
    public String playSong(Song song) {
        System.out.println( song+ " song is playing in  Fizy ");
        return song.getName();
    }
}
