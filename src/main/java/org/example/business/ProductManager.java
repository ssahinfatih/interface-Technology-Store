package org.example.business;

import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

//iş kurallarımızı yazarız.
public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void  add(Product product) throws Exception {
      if(product.getId()<=0 ){
          throw new Exception("Ürün id'si eksik yada hatalı !!! ");
      }
      productDao.create(product);
    }

    public  void  get(Product product) throws  Exception{
        if(product.getId()<=0 ){
            throw new Exception("Ürün id'si eksik yada hatalı !!! ");
        }
        productDao.read(product);
    }

    public  void  update(Product product) throws  Exception{
        if(product.getId()<=0 ){
            throw new Exception("Ürün id'si eksik yada hatalı !!! ");
        }
        productDao.update(product);
    }

    public  void  delete(Product product) throws  Exception{
        if(product.getId()<=0 ){
            throw new Exception("Ürün id'si eksik yada hatalı !!! ");
        }
        productDao.delete(product);
    }


}
