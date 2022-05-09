package entities;

import java.util.jar.Attributes.Name;

import entities.enums.Services;

public class Client {
    private String name;
    private Integer number;
    private String address;
    private Double price;
    private Services services;

    public Client(){
    }

    public Client(String name, Integer number, String address, Double price, Services services){
        this.name = name;
        this.number = number;
        this.address = address;
        this.price = price;
        this.services = services;
    }

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
    
    public static String toString(String name, Integer number, String address, Double price, Services services){
      return "Cliente: " + name +
      "\ntelefone para contato: " + number +
      "\nEndereço: " + address +
      "\nPreço: " + price +
      "\nTipo de serviço: " + services;

    }
}
