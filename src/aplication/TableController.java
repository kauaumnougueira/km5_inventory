package aplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import entities.Saving;
import guiAbstract.AbstractController;

public class TableController extends AbstractController{
    Saving saving = new Saving();

    @FXML
    private Label table;

    @FXML
    private Button back;
    @FXML
    private Button toSee;

    @FXML
    public void onToSeeAction(){
    
        table.setText(saving.readingClient());
    }

    @FXML
    public void onBackAction() throws Exception{
        deleteFrameAndGo(back, "layout.fxml", "Gerenciador KM5");
    }
}
