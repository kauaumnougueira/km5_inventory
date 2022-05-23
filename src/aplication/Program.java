package aplication;

import javafx.application.Application;
import javafx.stage.Stage;

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
        ClientAddController start = new ClientAddController();
        start.createFrame("layout.fxml", "Gerenciador KM5");
    }
    public static void main(String[] args){
        launch(args);
    }
    //testar show()
}