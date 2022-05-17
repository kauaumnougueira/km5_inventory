package aplication;

import entities.Client;
import entities.Saving;
import guiAbstract.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ClientAddController<T> extends AbstractController{
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
    private ChoiceBox services;


    @FXML
    public void onBackAction() throws Exception{
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }

    @FXML
    public void onSendAction(){
        String name = this.name.getText();
        String number = this.number.getText();
        String address = this.address.getText();
        String price = this.price.getText();
        String services = this.price.getText();

        //Enviando para a classe Client
        Client client = new Client(name, number, address, price, services);
        Saving saving = new Saving(client.toString());
        System.out.println(client); //printando resultado do envio no console
        saving.writingClient(); //salvando no arquivo
    }
}
