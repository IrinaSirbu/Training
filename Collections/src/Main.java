import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by isirbu on 10/31/2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        /* EXERCISE 1*/
        System.out.println("EXERCISE 1");
        Queue queue = new Queue();

        queue.add(5);
        queue.add(7);
        queue.add(14);
        queue.add(2);

        System.out.println(queue.toString());

        queue.poll();
        System.out.println(queue.toString());

        System.out.println(queue.peek());

        System.out.println(queue.getValue(2));
        System.out.println("\n");


        /* EXERCISE 2*/
        FileInputStream input = new FileInputStream("date.in");
        FileOutputStream output = new FileOutputStream("date.out");

        try {
            Scanner s = new Scanner(input);
            int x = s.nextInt();
            int y;
            Graf graf = new Graf(x);

            int nr = s.nextInt();

            for (int i = 0; i < nr; i++){
                x = s.nextInt();
                y = s.nextInt();
                graf.addEdge(x, y);
            }

            byte[] bytes = graf.toString().getBytes();
            output.write(bytes);
            output.flush();
        } finally {
            input.close();
            output.close();
        }

        /* EXERCISE 3*/

        System.out.println("EXERCISE 3");
        String file = "Xor.in";
        String key = "caine";
        Xor x = new Xor(file,key);
        x.print();


    }
}
