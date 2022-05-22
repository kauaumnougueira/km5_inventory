package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandler {

    private String save;
    String path = "Clients.txt";
    String lineEdited;

    public fileHandler() {
    }

    public fileHandler(String save) {
        this.setSave(save);
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public void writingClient(){
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

    public String readingClient(){
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
    
}
