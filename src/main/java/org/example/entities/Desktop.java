package org.example.entities;

public class Desktop extends Product{

    private  String model;
    private  String ram;
    private  String gpu;
    private  double hdd;

    public Desktop(String model, String ram, String gpu, double hdd) {
        this.model = model;
        this.ram = ram;
        this.gpu = gpu;
        this.hdd = hdd;
    }

    public Desktop(int id, String productName, double unitPrice, String model, String ram, String gpu, double hdd) {
        super(id, productName, unitPrice);
        this.model = model;
        this.ram = ram;
        this.gpu = gpu;
        this.hdd = hdd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public double getHdd() {
        return hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }
}
