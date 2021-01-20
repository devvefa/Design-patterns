package com.company.Structural.bridge.bridgeXX;

public class Spotify {
    public  String playSong(Song song){
        System.out.println( song+ " song is playing in  Spotify ");
        return song.getSound();
    }
}
