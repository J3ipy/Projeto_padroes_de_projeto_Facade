package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;


public class DefaultSoundSystem implements ISoundSystem {
    @Override public void turnOn() { Logger.info("Sistema de Som: Ligando"); }
    @Override public void turnOff() { Logger.info("Sistema de Som: Desligando"); }
    @Override public void setMode(AudioMode mode) { Logger.info("Sistema de Som: Modo definido para " + mode); }
}