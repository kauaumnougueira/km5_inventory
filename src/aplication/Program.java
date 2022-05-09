package aplication;

import java.util.Scanner;

import entities.Client;
import entities.enums.Services;

public class Program {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        //login
        
        

        System.out.println("Deseja adcionar algum serviço?(y/n) ");
        String choice = inp.next();

        if(choice == "y"){
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
                System.out.println("Serviço ofertado: ");
                Services services = Services.valueOf(inp.next());      
                Client client = new Client(name, number, address, price, services);      
                System.out.println(client);
        }
        }else{
            //alteração de algo ja existente
        }
        inp.close();
    }
}