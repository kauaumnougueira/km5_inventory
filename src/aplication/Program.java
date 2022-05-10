package aplication;

import java.util.Scanner;

import entities.Client;
import entities.Saving;
import entities.enums.Services;
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
        /*Scanner inp = new Scanner(System.in);

        //login
        
        System.out.println("Deseja adcionar algum serviço?(s/n) ");
        String choice = inp.next();

        if(choice.equals("s")){
            //criação de novos clientes 
            System.out.println("Quantos? ");
            int quantity = inp.nextInt();
            for(int i = 0; i<quantity; i++){
                System.out.println("Nome do cliente: ");
                String name = inp.next();
                System.out.println("Número para contato: "); 
                int number = inp.nextInt();
                System.out.println("Endereço: ");
                String address = inp.next();
                System.out.println("Preço do serviço: ");
                Double price = inp.nextDouble();
                System.out.println("Serviço ofertado (LIMPEZA,MANUTENCAO,INSTALACAO, DESINSTALACAO, OUTROS): ");
                Services services = Services.valueOf(inp.next());      
                Client client = new Client(name, number, address, price, services);      
                System.out.println(client);

                System.out.println("Deseja salvar? (s/n)");
                String choice2 = inp.next();
                if(choice2.equals("s")){
                    String save = client.toString();
                    Saving saving = new Saving(save);
                    saving.writingClient();
                }
        }
        }else{
                    
            //alteração de algo ja existente
        }
        inp.close();*/
    }
}