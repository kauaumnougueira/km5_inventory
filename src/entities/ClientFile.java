package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class ClientFile {
    //1- ler o arquivo
    //2- separar a string em array
    //3- retirar # do array
    //4- objectFileClient() -- transforma em objeto  

    //apenas implementação de fora https://www.techiedelight.com/pt/remove-element-from-array-java/
    public static String[] removeElement(String[] arr, String item) {
        return Arrays.stream(arr)
                .filter(s -> !s.equals(item))
                .toArray(String[]::new);
    }
    
    public String[] toObjectFileClient(){
        FileHandler readFunction = new FileHandler();

        //1
        String clients = readFunction.readingFileClient();

        //2
        String[] clientsArray = clients.split("#########");
        ArrayList<Integer> espaco = new ArrayList<>();

        //conhecendo os espaços
        for(int i = 0; i < clientsArray.length; i++){
            if(clientsArray[i].contains(" ")){
                espaco.add(i);
            }
        }
        //retirando os espaços
        for(int i = 0; i < espaco.size(); i++){
            clientsArray = removeElement(clientsArray, clientsArray[espaco.get(i)]);
        }


        return clientsArray;
    }
}
 