package org.example.entities;

public class Mouse extends Product{

    private double dpa;
    private boolean rgb;

    public Mouse(double dpa, boolean rgb) {
        this.dpa = dpa;
        this.rgb = rgb;
    }

    public Mouse(int id, String productName, double unitPrice, double dpa, boolean rgb) {
        super(id, productName, unitPrice);
        this.dpa = dpa;
        this.rgb = rgb;
    }

    public double getDpa() {
        return dpa;
    }

    public void setDpa(double dpa) {
        this.dpa = dpa;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
}
