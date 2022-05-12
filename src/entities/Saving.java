package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Saving {

    private String save;

    public Saving() {
    }

    public Saving(String save) {
        this.setSave(save);
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    
    public String readingClient() {
        //String[] lineRead = new String[5];
        //String lineRead2 = " ";
        String path = "Clients.txt";
        String lineSave = " ";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            
            while (line != null) {
              //  int i = 0;
                
              //  lineRead[i] = line;
                line = br.readLine();
                
                lineSave += line;
              //  i++;
            }
           // lineRead2 = Arrays.toString(lineRead);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       // return lineRead2;
       return lineSave;
    }

    public void writingClient(){
        String path = "Clients.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            String[] saveSplitted = save.split("#");
            for(String line : saveSplitted){
                bw.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
