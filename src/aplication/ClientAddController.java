package aplication;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Client;
import entities.Saving;
import guiAbstract.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ClientAddController extends AbstractController implements Initializable{
    String[] services = {"LIMPEZA", "MONTAGEM", "DESMONTAGEM"};


    @FXML
    private Button back;
    @FXML
    private Button send;

    @FXML
    private TextField name;
    @FXML
    private TextField number;
    @FXML
    private TextField address;
    @FXML
    private TextField price;
    @FXML 
    private ChoiceBox<String> servicesBox;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        servicesBox.getItems().addAll(services);
    }
    

    @FXML
    public void onBackAction(){
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }


    //getting values
    @FXML
    public void onSendAction(){
        String name = this.name.getText();
        String number = this.number.getText();
        String address = this.address.getText();
        String price = this.price.getText();
        String services = this.servicesBox.getValue();

        //Enviando para a classe Client
        Client client = new Client(name, number, address, price, services);
        Saving saving = new Saving(client.toString());
        System.out.println(client); //printando resultado do envio no console
        saving.writingClient(); //salvando no arquivo

        deleteFrameAndGo(send, "layout.fxml", "Gerenciador KM5");
    }

    
}
