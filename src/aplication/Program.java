package aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Program  extends Application{

    /*
    #########CONFIGURAÇÃO DO LAYOUT PRINCIPAL########
    1.0 - ADCIONAR UM SERVIÇO
        1.1 - ADCIONAR DADOS DO SERVIÇO
    2.0 - VER TABELA
        2.1 - VER TABELA 
    3.0 - ALTERAR TABELA
        3.1 - CONSTRUINDO...    
    */

    @Override
    public void start(Stage stage){
        //importando tela do fxml
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
            Parent root = loader.load();
            Scene tela = new Scene(root);
         
            stage.setTitle("Gerenciador KM5");
            stage.setScene(tela);
            stage.show();
        }catch(Exception e){
            e.getMessage();
        }
        
    }
    public static void main(String[] args){
        launch(args);
    }
}