package aplication;

import guiAbstract.AbstractController;
import entities.FileHandler;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClientChangeController extends AbstractController{
    
    @FXML
    private Button back;
    @FXML
    private Button searchButton;

    @FXML
    private TextField searchBar;
    
    @FXML
    public void onActionSearch(){
        textFieldChangeSave();

        FileHandler searchFunction = new FileHandler();
        searchFunction.searchFileClient(textFieldChangeSave());
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
