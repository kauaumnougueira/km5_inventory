package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private String save;
    String path = "Clients.txt";
    String lineEdited;

    public FileHandler() {
    }

    public FileHandler(String save) {
        this.setSave(save);
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public void writingFileClient(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String[] saveSplitted = save.split("-");
            for(String line : saveSplitted){
                if(line == " ")
                    bw.write(" ");
                else
                    bw.write(line);
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

    public void searchFileClient(String search){
        if(readingFileClient().contains(search)){
            System.out.println("funcionou");
        }else{
            System.out.println("nao funcionou");
        }
    }
    //implementar backup
}
