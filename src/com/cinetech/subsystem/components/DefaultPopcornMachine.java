package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;

public class DefaultPopcornMachine implements IPopcornMachine {
    @Override public void turnOn() { Logger.info("Máquina de Pipoca: Ligando"); }
    @Override public void makePopcorn() { Logger.info("Máquina de Pipoca: Fazendo pipoca!"); }
    @Override public void turnOff() { Logger.info("Máquina de Pipoca: Desligando"); }
}