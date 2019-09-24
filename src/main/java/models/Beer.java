package models;

public class Beer {
    private int id;
    private String name;
    private String brand;
    private String location;
    private int qty;
    private float price;

    public Beer(int id, String name, String brand, String location, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.location = location;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
