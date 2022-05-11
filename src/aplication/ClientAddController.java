package aplication;


import guiAbstract.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ClientAddController extends AbstractController{
    @FXML
    private Button back;

    @FXML
    public void onBackAction() throws Exception{
        deleteFrameAndBAck(back, "layout.fxml", "Gerenciador KM5");
    }
}
