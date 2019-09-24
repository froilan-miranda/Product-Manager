package models;

public class Whiskey {
    private int id;
    private String brand;
    private String location;
    private float price;
    private int qty;

    public Whiskey(int id, String brand, String location, float price, int qty) {
        this.id = id;
        this.brand = brand;
        this.location = location;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
