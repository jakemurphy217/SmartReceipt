package com.example.smartreceipt;

public class Receipt {

    private String Name;
    private String Cost;
    private int photo;


    public Receipt() {
    }


    public Receipt(String name, String cost, int photo) {
        Name = name;
        Cost = cost;
        this.photo = photo;
    }

    //getter
    public String getName() {
        return Name;
    }

    public String getCost() {
        return Cost;
    }

    public int getPhoto() {
        return photo;
    }

    //setter


    public void setName(String name) {
        Name = name;
    }

    public void setCost(String cost) {
        Cost = cost;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
