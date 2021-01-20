package com.company.Structural.bridge.bridge.device;

import com.company.Structural.bridge.bridge.Song;
import com.company.Structural.bridge.bridge.musicplayer.IMusicPlayer;
import com.company.Structural.bridge.bridge.sounddevice.ISpeakerDevice;


public abstract class PlatformPlayMusic {

    protected ISpeakerDevice computerSpeaker;
    protected IMusicPlayer computerMusicPlayer;

    public PlatformPlayMusic() {
    }

    public PlatformPlayMusic(ISpeakerDevice computerSpeaker, IMusicPlayer computerMusicPlayer) {
        this.computerSpeaker = computerSpeaker;
        this.computerMusicPlayer = computerMusicPlayer;
    }
    void  playSong(Song song){
        String ses = computerMusicPlayer.playSong(song);
        computerSpeaker.playIncomingVoice(ses);

    }

}
