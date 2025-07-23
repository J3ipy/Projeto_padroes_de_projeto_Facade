package com.cinetech.subsystem.interfaces;
import com.cinetech.utils.AudioMode;
import com.cinetech.utils.LightLevel;

// IAudioPlayer.java
public interface IAudioPlayer {
    void load(String trackName);
    void play();
    void stop();
    void setVolume(int level);
}