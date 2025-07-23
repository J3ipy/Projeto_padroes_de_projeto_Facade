package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;


public class DefaultProjector implements IProjector {
    @Override public void turnOn() { Logger.info("Projetor: Ligando"); }
    @Override public void turnOff() { Logger.info("Projetor: Desligando"); }
    @Override public void setInput(String source) { Logger.info("Projetor: Entrada definida para '" + source + "'"); }
}