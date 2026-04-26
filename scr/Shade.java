package com.example.artmap;

public enum Shade {
    VERY_DARK(0.4),
    DARK(0.6),
    NORMAL(0.8),
    LIGHT(1.0),
    VERY_LIGHT(1.2);

    public final double m;

    Shade(double m) {
        this.m = m;
    }
}
