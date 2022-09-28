package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    /*
    FUNÇÕES QUE TRATAM O ARQUIVO
    1.0 - writingFileClient() -- recebe a matriz save e transforma em String para escrever no arquivo
    2.0 - readingFileClient() -- transforma cada linha em uma String e "lê"
    3.0 - searchFileClient(String search) -- pesquisa no arquivo baseado na leitura do método 2
    
    */

    private String[][] save;
    String path = "Clients.txt";
    String lineEdited;

    public FileHandler() {
    }

    public FileHandler(String[][] save) {
        this.setSave(save);
    }

    public String[][] getSave() {
        return save;
    }

    public void setSave(String[][] save) {
        this.save = save;
    }

    public void writingFileClient(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            //String[] saveSplitted = save[][].split("-");
            
            for(String[] saveSplittedLine : save){
                for(String line : saveSplittedLine){
                    bw.write(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readingFileClient(){
        String lineSave = " ";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            
            while(line != null){
                line = br.readLine();
                if(line != null){
                    lineSave += line.replace("#", "") + "\n";
                }
            }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        //retorna em String para funcionar no Label Text
       return lineSave;
    }

    public String searchFileClient(String search){

        if(readingFileClient().contains(search)){
            String[] part1 = readingFileClient().split(search);
            String part2 = part1[1];
            String[] part3 = part2.split("#");
            String partFinal = part3[0];
            System.out.println("Client: " + search + partFinal);
            
            System.out.println("Enontrou");
            
            return "Client: " + search + partFinal;
        }else{
            System.out.println("nao encontrou");
            
            return null;
        }
    }

    public void  handleSearch(){
    
    }
    
   
}
