package com.cinetech.subsystem.interfaces;
import com.cinetech.utils.AudioMode;
import com.cinetech.utils.LightLevel;

public interface ISoundSystem {
    void turnOn();
    void turnOff();
    void setMode(AudioMode mode);
}