package com.cinetech.subsystem.interfaces;
import com.cinetech.utils.AudioMode;
import com.cinetech.utils.LightLevel;

public interface ISubtitleService {
    void load(String movieName);
    void enable();
    void disable();
}