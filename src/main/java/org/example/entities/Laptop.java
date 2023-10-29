package org.example.entities;

public class Laptop extends Product{

    private String caseType;
    private boolean wifi;

    private boolean camera;

    public Laptop(String caseType, boolean wifi, boolean camera) {
        this.caseType = caseType;
        this.wifi = wifi;
        this.camera = camera;
    }

    public Laptop(int id, String productName, double unitPrice, String caseType, boolean wifi, boolean camera) {
        super(id, productName, unitPrice);
        this.caseType = caseType;
        this.wifi = wifi;
        this.camera = camera;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
}
