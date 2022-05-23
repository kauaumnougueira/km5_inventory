package aplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import entities.FileHandler;
import guiAbstract.AbstractController;

public class ClientTableController extends AbstractController{
    FileHandler saving = new FileHandler();

    @FXML
    private Label table1;
    
    @FXML
    private Button back;
    @FXML
    private Button toSee;

    @FXML
    public void onToSeeAction(){
        table1.setText(saving.readingFileClient());
    }

    @FXML
    public void onBackAction(){
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }

    //configure scroll bar
}
