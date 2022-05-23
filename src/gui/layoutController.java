package gui;


import guiAbstract.AbstractController;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class layoutController extends AbstractController{
    @FXML
    private Button add;
    @FXML
    private Button toSee;
    @FXML
    private Button change;

    @FXML
    public void onChangeActionAdd(){
        deleteFrameAndGo(add, "ClientAdd.fxml", "ADCIONANDO NOVOS SERVIÇOS"); 
    }

    @FXML
    public void onChangeActionToSee(){
        deleteFrameAndGo(toSee, "ClientTable.fxml", "TABELA");
    }

    @FXML
    public void onChangeActionChange(){
        deleteFrameAndGo(change, "ClientChange.fxml", "ADCIONANDO NOVOS SERVIÇOS"); 
    }
}
