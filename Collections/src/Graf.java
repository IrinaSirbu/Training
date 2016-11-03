import java.util.ArrayList;

/**
 * Created by isirbu on 10/31/2016.
 */

public class Graf {

    int vertices;
    ArrayList<Queue> list;

    public Graf(int vertices) {
        this.vertices = vertices;
        list = new ArrayList<>();
        for (int i = 0; i < vertices ; i++){
            list.add(new Queue());
        }
    }

    public void addEdge(int x, int y){

        if(list.get(x).verif(y) == 1) {
            list.get(x).add(y);
            list.get(y).add(x);
        }
    }

    public String toString(){

        String s = new String();

        for (int i = 0; i < vertices; i++){
            s += i + ": " + list.get(i).toString() + "\n";
        }

        s += " ";
        return s;
    }
}
