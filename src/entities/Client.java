package entities;


public class Client {
    private String name;
    private String number;
    private String address;
    private String price;
    private String data;
    private String services;

    public Client(){
    }

    public Client(String name, String number, String address, String price, String data,  String services){
        this.name = name;
        this.number = number;
        this.address = address;
        this.price = price;
        this.data = data;
        this.services = services;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
    
    public String[][] clientSaveMatriz(){
        String clientSave[][] = 
        {
            {" ", " "},
            {"#####", "####"},
            {"\n#Cliente: ", name},
            {"\n#Telefone para contato: ", number},
            {"\n#Endereço: ", address},
            {"\n#Preço: ", price},
            {"\n#Data: ", data},
            {"\nServiço: ", services},
            {"\n#####", "####"},
            {" ", " "}
        };
        return clientSave;
    }

    public void clientLog(){
        for(String[] saveSplittedLine : clientSaveMatriz()){
            for(String line : saveSplittedLine){
                if(line == " ")
                    System.out.println(" ");
                else
                    System.out.println(line);
            }
        }
    }
}

