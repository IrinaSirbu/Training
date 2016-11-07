import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by isirbu on 11/3/2016.
 */

public class Folder {

    private FileWriter fileOutput;

    public Folder(String fileName){

        try {
            this.fileOutput = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.println("I/O Exception");
        }
    }

    public void show(File file, int nr){

            try {

                for (int i = 0; i < nr; i++){
                    fileOutput.write("    ");
                    fileOutput.flush();
                }

                if(file.isDirectory()) {

                    fileOutput.write(file.getName() + "\n");
                    fileOutput.flush();

                    if(file.listFiles() != null) {
                        for (File i : file.listFiles()) {
                            show(i,nr + 1);
                        }
                    }
                } else {
                    fileOutput.write(file.getName() + "\n");
                    fileOutput.flush();
                }

            } catch (IOException e) {
                System.out.println("I/O Exception");
            }
    }
}
