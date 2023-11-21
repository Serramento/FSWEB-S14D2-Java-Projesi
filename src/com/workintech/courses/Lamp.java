package com.workintech.courses;

import com.workintech.courses.enums.LampType;

public class Lamp {
    private boolean batteryPowered;
    private int globRating;
    private LampType style;
    private boolean turnedOn;

    public Lamp(boolean batteryPowered, int globRating, LampType style) {
        this.batteryPowered = batteryPowered;
        this.globRating = globRating;
        this.style = style;
        this.turnedOn= false;
    }
    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public int getGlobRating() {
        return globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public void toggle(){
        turnedOn= !turnedOn;
    }
    public void status(){
        String status= turnedOn ? "on" : "off";
        System.out.println("Lamp is "+status);
    }
}
