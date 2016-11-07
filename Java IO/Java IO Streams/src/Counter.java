import java.io.*;

/**
 * Created by isirbu on 11/2/2016.
 */

public class Counter {

    private int numberApp;
    private char c;
    private RandomAccessFile  file;

    public Counter(char c, String fileName, long start) {

        this.numberApp = 0;
        this.c = c;

        try {
            file = new RandomAccessFile(fileName,"r");
            file.seek(start);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }

    public int count(){

        try {

            int ch = file.read();
            while (ch != -1){
                if(ch == c){
                    numberApp ++;
                }
                ch = file.read();
            }
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }

        return numberApp;
    }
}
