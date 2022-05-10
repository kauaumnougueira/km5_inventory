package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

    
    public void readingClient() {

        String path = "C:\\Users\\kaua\\Desktop\\pessoal\\java\\km5_inventory\\Clients.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void writingClient(){
        String path = "C:\\Users\\kaua\\Desktop\\pessoal\\java\\km5_inventory\\Clients.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            String[] saveSplitted = save.split("#");
            for(String line : saveSplitted){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
