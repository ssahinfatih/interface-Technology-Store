package org.example.dataAccess;

import org.example.entities.Product;

public class MySql implements ProductDao{
    @Override
    public void create(Product product) {
        System.out.println(product.getProductName()+" MySQL ile yaratıldı.");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getProductName()+" MySQL ile güncellendi.");
    }

    @Override
    public void read(Product product) {
        System.out.println(product.getProductName()+" MySQL ile okundu.");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getProductName()+" MySQL ile silindi.");
    }
}
