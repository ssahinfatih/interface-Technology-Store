package org.example.entities;

public class Keyboard extends  Product{

    private String color;
    private boolean bluetooth;

    public Keyboard(String color, boolean bluetooth) {
        this.color = color;
        this.bluetooth = bluetooth;
    }

    public Keyboard(int id, String productName, double unitPrice, String color, boolean bluetooth) {
        super(id, productName, unitPrice);
        this.color = color;
        this.bluetooth = bluetooth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
