package aplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import entities.fileHandler;
import guiAbstract.AbstractController;

public class TableController extends AbstractController{
    fileHandler saving = new fileHandler();

    @FXML
    private Label table1;
    
    @FXML
    private Button back;
    @FXML
    private Button toSee;

    @FXML
    public void onToSeeAction(){
        table1.setText(saving.readingClient());
    }

    @FXML
    public void onBackAction(){
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }

    //configure scroll bar
}
