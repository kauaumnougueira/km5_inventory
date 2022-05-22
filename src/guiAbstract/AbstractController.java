package guiAbstract;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public abstract class AbstractController {
    /*
    métodos utilizados com muita frequencia nas classes do código
    1.0 - Métodos de configuração de frames(stage)
    */

    private Stage stageAtual;

    //1.0 Métodos de configuração de frames(stage)
    @FXML
    public void createFrame(String path, String title){
        Stage stage = new Stage();
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent root = loader.load();
            Scene tela = new Scene(root);
            stage.setTitle(title);
            stage.setScene(tela);
            stage.show();
        }catch(IOException e){
            e.getMessage();
        }
    }

    @FXML
    public void captureFrame(Button action){ 
        //captura o frame atual 
        stageAtual = (Stage) action.getScene().getWindow();
    }

    @FXML
    public void deleteFrameAndGo(Button action, String path, String title){
            //capturando tela atual
            captureFrame(action);
            //fechando a tela atual
            stageAtual.close();
            //Abrindo nova tela
            createFrame(path, title);
    }

}
