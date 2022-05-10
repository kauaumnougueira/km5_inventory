package entities;

public class Saving {
    private String name;
    private String number;
    private String address;
    private String price;
    private String service;

    public Saving(){
    }
    
    public Saving(String name, String number, String address, String price, String service) {
        this.setName(name);
        this.setNumber(number);
        this.setAddress(address);
        this.setPrice(price);
        this.setService(service);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
