package com.company.Structural.bridge.bridge.musicplayer;

import com.company.Structural.bridge.bridge.Song;

public class Spotify implements  IMusicPlayer{
    @Override
    public String playSong(Song song) {

        System.out.println( song+ " song is playing in  Spotify ");
        return song.getName();
    }
}
