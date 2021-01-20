package com.company.Structural.bridge.bridge.device;

import com.company.Structural.bridge.bridge.Song;
import com.company.Structural.bridge.bridge.musicplayer.Fizy;
import com.company.Structural.bridge.bridge.sounddevice.headphone;

public class ComputerHeadphoneFizy extends PlatformPlayMusic{

    public ComputerHeadphoneFizy(){
        computerSpeaker=new headphone();
        computerMusicPlayer=new Fizy();
    }

    @Override
    public void playSong(Song song) {

            System.out.println( " you hear music on Headphone via Fizy ");
        super.playSong(song);
    }
}
