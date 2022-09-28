package dao;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientDao {
    public static List<Client> clients = new ArrayList<Client>();

    public void save(Client client){
        clients.add(client);
    }

    public List<Client> getClients(){
        return clients;
    }
}
