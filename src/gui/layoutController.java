package gui;

import aplication.Program;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class layoutController extends Program{
    @FXML
    private Button add;

    @FXML
    public void onAddAction()throws Exception{
        //fechando a tela atual
        Stage stageAtual = (Stage) add.getScene().getWindow(); //Obtendo a janela atual
        stageAtual.close();

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClientAdd.fxml"));
        Parent root = loader.load();
        Scene tela = new Scene(root);
         
        stage.setTitle("ADCIONANDO NOVOS SERVIÇOS");
        stage.setScene(tela);
        stage.show();
    }
}
