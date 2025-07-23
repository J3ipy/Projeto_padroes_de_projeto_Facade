package com.cinetech.subsystem.interfaces;
import com.cinetech.utils.AudioMode;
import com.cinetech.utils.LightLevel;

public interface IVideoPlayer {
    void load(String fileName);
    void play();
    void stop();
}