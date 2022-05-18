package guiAbstract;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public abstract class AbstractController {

    @FXML
    public void deleteFrameAndGo(Button e, String path, String title){
        try{
            //fechando a tela atual
            Stage stageAtual = (Stage) e.getScene().getWindow(); //Obtendo a janela atual
            stageAtual.close();
            //Abrindo nova tela
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
            Parent root = loader.load();
            Scene tela = new Scene(root);
         
            stage.setTitle(title);
            stage.setScene(tela);
            stage.show();
        }catch(Exception exception){
            exception.getMessage();
        }
    }

}
