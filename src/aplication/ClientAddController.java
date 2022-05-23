package aplication;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Client;
import entities.FileHandler;
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
        //importante modificação para melhorar a distribuiçãio de funcoes do código
        textFieldAddSave();
        deleteFrameAndGo(send, "layout.fxml", "Gerenciador KM5");
    }

    @FXML
    public void textFieldAddSave(){
        String name = this.name.getText();
        String number = this.number.getText();
        String address = this.address.getText();
        String price = this.price.getText();
        String services = this.servicesBox.getValue();

        //Enviando para a classe Client (que enviará para a classe "FileHandler e salvará no arquivo")
        Client client = new Client(name, number, address, price, services);
        FileHandler saving = new FileHandler(client.toString());
        System.out.println(("print client object: "));
        System.out.println(client); //printando resultado do envio no console
        saving.writingFileClient(); //salvando no arquivo
        
    }
    
}
