package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;


public class DefaultTheatreScreen implements ITheatreScreen {
    @Override public void down() { Logger.info("Tela de Projeção: Descendo"); }
    @Override public void up() { Logger.info("Tela de Projeção: Subindo"); }
}