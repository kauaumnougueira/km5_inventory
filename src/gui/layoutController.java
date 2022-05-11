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
    private Button toSee;
    @FXML
    private Button change;

    @FXML
    public void onChangeAction() throws Exception{
        onAction(add, "ClientAdd.fxml", "ADCIONANDO NOVOS SERVIÇOS"); 
    }
    
    @FXML
    public void onAction(Button e, String path, String title) throws Exception{
        deleteFrame(toSee);
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Parent root = loader.load();
        Scene tela = new Scene(root);
         
        stage.setTitle(title);
        stage.setScene(tela);
        stage.show();
    }

    @FXML
    public void onAddAction()throws Exception{
        deleteFrame(add);

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ClientAdd.fxml"));
        Parent root = loader.load();
        Scene tela = new Scene(root);
         
        stage.setTitle("ADCIONANDO NOVOS SERVIÇOS");
        stage.setScene(tela);
        stage.show();
    }
    
    public void deleteFrame(Button e){
        //fechando a tela atual
        Stage stageAtual = (Stage) e.getScene().getWindow(); //Obtendo a janela atual
        stageAtual.close();
    }
}
