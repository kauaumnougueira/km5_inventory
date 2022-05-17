package entities;


public class Client {
    private String name;
    private String number;
    private String address;
    private String price;
    private String services;

    public Client(){
    }

    public Client(String name, String number, String address, String price, String services){
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

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    } 

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String price() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    } 

    public String getServices() {
        return services;
    }
    public void setServices(String services) {
        this.services = services;
    }
    
    public String toString(){
      return "\n-##########" + 
      "\n-#Cliente: " + name +
      "\n-#Telefone para contato: " + number +
      "\n-#Endereço: " + address +
      "\n-#Preço: " + price +
      "\n-#Tipo de serviço: " + services +
      "\n-##########";
    }
}
