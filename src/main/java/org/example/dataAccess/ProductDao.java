package org.example.dataAccess;

import org.example.entities.Product;
// interface işlemler için soyut bir iskelet oluşturur.
//veritanabı işlemlerimiz için iskelet oluşturuyouruz ki yenlikler geldikçe sabit kurallar olsun sürdürülebilirlik.
public interface ProductDao {
    void  create(Product product);
    void  update(Product product);
    void read(Product product);
    void  delete(Product product);
}
