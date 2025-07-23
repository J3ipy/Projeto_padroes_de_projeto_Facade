package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;

// DefaultAudioPlayer.java
public class DefaultAudioPlayer implements IAudioPlayer {
    @Override public void load(String trackName) { Logger.info("Player de Áudio: Carregando '" + trackName + "'"); }
    @Override public void play() { Logger.info("Player de Áudio: Reproduzindo"); }
    @Override public void stop() { Logger.info("Player de Áudio: Parado"); }
    @Override public void setVolume(int level) { Logger.info("Player de Áudio: Volume ajustado para " + level); }
}