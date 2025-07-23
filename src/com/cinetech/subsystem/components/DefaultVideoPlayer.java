package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;


public class DefaultVideoPlayer implements IVideoPlayer {
    @Override public void load(String fileName) { Logger.info("Player de Vídeo: Carregando '" + fileName + "'"); }
    @Override public void play() { Logger.info("Player de Vídeo: Reproduzindo"); }
    @Override public void stop() { Logger.info("Player de Vídeo: Parado"); }
}