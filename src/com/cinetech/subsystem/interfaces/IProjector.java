package com.cinetech.subsystem.interfaces;
import com.cinetech.utils.AudioMode;
import com.cinetech.utils.LightLevel;

public interface IProjector {
    void turnOn();
    void turnOff();
    void setInput(String source);
}