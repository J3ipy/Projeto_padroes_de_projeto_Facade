package com.cinetech.subsystem.components;

import com.cinetech.subsystem.interfaces.*;
import com.cinetech.utils.*;


public class DefaultLights implements ILights {
    @Override public void setLevel(LightLevel level) { Logger.info("Luzes: Nível ajustado para " + level + " (" + level.getBrightness() + "%)"); }
}