package com.cinetech.utils;

public enum LightLevel {
    OFF(0),
    DIM(10),
    AMBIENT(50),
    BRIGHT(100);

    private final int brightness;

    LightLevel(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }
}