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
    public void onChangeAction() throws Exception{
        deleteFrameAndGo(add, "ClientAdd.fxml", "ADCIONANDO NOVOS SERVIÇOS"); 
    }
}
