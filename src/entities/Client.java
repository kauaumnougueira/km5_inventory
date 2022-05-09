package entities;

import entities.enums.Services;

public class Client {
    private String name;
    private Integer number;
    private String address;
    private Double price;
    private Services services;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    } 

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    } 


    public Double price() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    } 

    public Services getServices() {
        return services;
    }
    public void setServices(Services services) {
        this.services = services;
    }
    
}
