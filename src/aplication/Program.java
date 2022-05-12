package aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Program  extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        //importando tela do fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = loader.load();
        Scene tela = new Scene(root);
         
        stage.setTitle("Gerenciador KM5");
        stage.setScene(tela);
        stage.show();
    
    }
    public static void main(String[] args) throws Exception{
        launch(args);
    }
}