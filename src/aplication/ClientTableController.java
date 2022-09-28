package aplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

import dao.ClientDao;
import entities.Client;
import entities.FileHandler;
import entities.ClientFile;
import guiAbstract.AbstractController;

public class ClientTableController extends AbstractController implements Initializable{
    FileHandler saving = new FileHandler();

    @FXML
    private Button back;
    @FXML
    private Button toSee;

    @FXML
    private TableView<Client> table = new TableView<Client>();

    @FXML
    private TableColumn<Client, String> colname = new TableColumn<>();
    @FXML
    private TableColumn<Client, String> coladdress = new TableColumn<>();
    @FXML
    private TableColumn<Client, String> colnumber = new TableColumn<>();
    @FXML
    private TableColumn<Client, String> colprice = new TableColumn<>();
    @FXML
    private TableColumn<Client, String> coldata = new TableColumn<>();
    @FXML
    private TableColumn<Client, String> colservice = new TableColumn<>();

    @Override
    public void initialize(URL url, ResourceBundle rb){
        colname.setCellValueFactory(new PropertyValueFactory<Client, String>("NOME"));
        coladdress.setCellValueFactory(new PropertyValueFactory<Client, String>("ENDEREÇO"));
        colnumber.setCellValueFactory(new PropertyValueFactory<Client, String>("NÚMERO"));
        colprice.setCellValueFactory(new PropertyValueFactory<Client, String>("PREÇO"));
        coldata.setCellValueFactory(new PropertyValueFactory<Client, String>("DATA"));
        colservice.setCellValueFactory(new PropertyValueFactory<Client, String>("SERVIÇO"));
        fillTable();
    }

    @FXML
    public void fillTable(){
        ClientFile clientFile = new ClientFile();
        clientFile.toObjectFileClient();
        ObservableList<Client> clients = FXCollections.observableArrayList(new ClientDao().getClients());
        table.setItems(clients);
    }

    @FXML
    public void onBackAction(){
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }

    //configure scroll bar
}
