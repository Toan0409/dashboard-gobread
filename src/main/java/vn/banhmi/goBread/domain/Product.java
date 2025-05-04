package vn.banhmi.goBread.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productIT;

    private String name;
    private String description;
    private double price;
    private String imageUrl;

    public long getproductIT() {
        return productIT;
    }

    public void setproductIT(long productIT) {
        this.productIT = productIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Product [productIT=" + productIT + ", name=" + name + ", description=" + description + ", price="
                + price + ", imageUrl=" + imageUrl + "]";
    }

}
