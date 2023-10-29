package org.example.dataAccess;

import org.example.entities.Product;

public class MongoDao implements ProductDao {
    @Override
    public void create(Product product) {
        System.out.println(product.getProductName()+" MongoDb ile yaratıldı.");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getProductName()+" MongoDb ile güncellendi.");
    }

    @Override
    public void read(Product product) {
        System.out.println(product.getProductName()+" MongoDb ile okundu.");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getProductName()+" MongoDb ile silindi.");
    }
}
