package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    /*
    FUNÇÕES QUE TRATAM O ARQUIVO
    1.0 - writingFileClient() -- recebe a matriz save e transforma em String para escrever nop arquivo
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

    public boolean searchFileClient(String search){
        Boolean found = null;
        if(readingFileClient().contains(search)){
            System.out.println("Enontrou");
            return found = true;
        }else{
            System.out.println("nao encontrou");
            return found = false;
        }
    }
    /*public boolean searchFileClient(String search){ //retornando em boolean pra ativar função necessária
        String[] partFileFounded = readingFileClient().split(" "); //trasnformando o return da função em array
        int indexArraySearch = readingFileClient().indexOf(search);//identificando index do array que tem a pesquisa

        Boolean foundSearch = null;

        if(partFileFounded[indexArraySearch].contains(search)){
            System.out.println("encontrou");
            foundSearch = true;
            foundArray(partFileFounded,indexArraySearch); //funcao que acha a parte do array
            System.out.println(foundArray(partFileFounded,indexArraySearch));
        }else{
            System.out.println("não encontrou");
            foundSearch = false;
        }

        //usar o boolean pra testar ifs e ativar methods
        return foundSearch;
    }

    public void deletePartFileClient(){
        //criar
    }

    public String foundArray(String[] partFileFounded, int indexArraySearch){
        //documentarmelhor o método

        //basicamente separar uma paerte especifica do array 
        String partFileFoundedSplited = partFileFounded[indexArraySearch]; //atribuindo array pego pelo index à string
        String[] partFileFoundedSplited2 = partFileFoundedSplited.split(" "); //dividindo String em novo array
        partFileFoundedSplited = partFileFoundedSplited2[0]; //reatribuindo string com parte desejada
        return partFileFoundedSplited;
    }*/

    //implementar backup
   
}
