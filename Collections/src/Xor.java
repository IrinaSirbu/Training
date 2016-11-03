import java.io.*;
import java.util.ArrayList;

/**
 * Created by isirbu on 11/3/2016.
 */
public class Xor {

    public FileReader input;
    public String k;
    public ArrayList<Integer> array;

    public Xor(String fileName, String k) {
        try {
            this.input = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.k = k;
        array = new ArrayList<>();
    }

    public void xor(){

        int c;
        int nr = 0;
        int size = k.length();

        try {
            c = input.read();
            while (c != -1) {

                if(c == '\n'){
                    c = input.read();
                } else if(c == '\r'){
                    c = input.read();
                } else {
                    array.add(c ^ k.charAt(nr % size));
                    c = input.read();
                    nr++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){

        xor();
        System.out.println(array);
    }
}
