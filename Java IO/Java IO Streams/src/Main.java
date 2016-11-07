import java.io.File;

/**
 * Created by isirbu on 11/2/2016.
 */

public class Main {

    public static void main(String[] args) {

        /* EXERCISE 1 */
        char c = 'a';
        String file1Input = "EX1.txt";
        long start = 5;
        Counter count = new Counter(c, file1Input, start);
        System.out.println(count.count());

        /* EXERCISE 2 */
        String file2Input = "EX2-in.txt";
        String file2Output = "EX2-out.txt";
        ReverseOrder reverse = new ReverseOrder(file2Input, file2Output);
        reverse.print();

        /* EXERCISE 3 */
        Folder f = new Folder("EX3-out.txt");
        File file = new File("C:\\Users\\isirbu\\Desktop");
        f.show(file,0);
    }
}
