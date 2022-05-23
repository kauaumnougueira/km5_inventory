package aplication;

import guiAbstract.AbstractController;
import entities.FileHandler;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ClientChangeController extends AbstractController{
    
    @FXML
    private Button back;
    @FXML
    private Button searchButton;

    @FXML
    private TextField searchBar;
    
    @FXML
    Alert errorFoundAlert = new Alert(AlertType.NONE);

    @FXML
    public void onActionSearch(){
        textFieldChangeSave();

        FileHandler searchFunction = new FileHandler();
        Boolean foundSearch = searchFunction.searchFileClient(textFieldChangeSave()); //recebendo boolean
        
        if(foundSearch == true){
            deleteFrameAndGo(searchButton , "Change.fxml", "Editar o necessário");
        }else{
            errorFoundAlert.setAlertType(AlertType.ERROR);
            errorFoundAlert.setContentText("não encontrado");
            errorFoundAlert.show();
        }
    }

    @FXML
    public void onBackAction(){
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }

    @FXML
    public String textFieldChangeSave(){
        String searchBar = this.searchBar.getText();
        return searchBar;
    }

}
