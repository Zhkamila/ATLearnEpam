package model;

import model.enums.Brand;
import model.enums.Color;

public class Car {
    private final int id;
    private final Brand brand;
    private final String model;
    private final int issueYear;
    private Color color;
    private int price;
    private String registrationNumber;

    public Car(int id, Brand brand, String model, int issueYear) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.issueYear = issueYear;
    }

    public Car(int id, Brand brand, String model, int issueYear, Color color, int price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.issueYear = issueYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", brand = " + brand +
                ", model = '" + model + '\'' +
                ", issueYear = " + issueYear +
                ", color = " + color +
                ", price = " + price +
                ", registrationNumber = '" + registrationNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand.toString();
    }

    public String getModel() {
        return model;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public String getColor() {
        if (color == null) {
            return "None";
        }
        return color.toString();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        if (registrationNumber == null) {
            return "None";
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
