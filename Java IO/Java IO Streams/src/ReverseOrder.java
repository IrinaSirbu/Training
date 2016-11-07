import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by isirbu on 11/2/2016.
 */

public class ReverseOrder {

    private FileReader fileInput;
    private FileWriter fileOutput;
    private ArrayList<String> list;

    public ReverseOrder(String fileNameInput, String fileNameOutput) {

        try {
            this.fileInput = new FileReader(fileNameInput);
            this.fileOutput = new FileWriter(fileNameOutput);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }

        this.list = new ArrayList<>();

    }

    public void reverse(){

        try {

            String word = "";
            int c = fileInput.read();
            while (c != -1){

                while (c == ' '){
                    c = fileInput.read();
                }

                while (c != ' ' && c != -1 && c != '\n' && c!='\r'){
                    word += (char) c;
                    c = fileInput.read();
                }

                list.add(word);
                word = "";

                if(c == '\r'){
                    c = fileInput.read();
                }

                if(c == '\n'){
                    c = fileInput.read();
                    if(c != -1)
                        list.add("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }

    public void print(){

        String s = "";
        reverse();

        for (int i = list.size() - 1; i >= 0; i--){
            s += list.get(i) + " ";
        }

        try {
            fileOutput.write(s);
            fileOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
