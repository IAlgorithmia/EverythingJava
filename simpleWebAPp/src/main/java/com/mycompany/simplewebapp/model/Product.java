package com.mycompany.simplewebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product() {
    }

    public Product(String prodName, int prodPrice, int prodId) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodId = prodId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                ", prodId=" + prodId +
                '}';
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
}
