package org.example;

import org.example.business.ProductManager;
import org.example.dataAccess.MongoDao;
import org.example.dataAccess.MySql;
import org.example.entities.*;

public class Main {
    public static void main(String[] args) throws Exception {

        //polymorphism çok biçimlilik - üst class alt class özellikleriyle çalıştırılabilir.
        Product product1=new Desktop(1,"thinkpad",47000,"Lenova","32GB","3.0Ghz",512);
        Product product2= new Laptop(2,"rog strix",52000,"çelik",true,true);
        Product product3= new Mouse(3,"steelseries",2500,8500,true);
        Product product4= new Keyboard(4,"inca",1400,"black",false);

        //Mouse mouse = new Mouse(8500,true);


        ProductManager mongo= new ProductManager(new MongoDao());
        ProductManager mysql=new ProductManager(new MongoDao());

        mongo.add(product1);
        mongo.get(product2);
        mysql.update(product3);
        mysql.delete(product4);


    }
}