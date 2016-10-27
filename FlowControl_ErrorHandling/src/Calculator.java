import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.List;

/**
 * Created by isirbu on 10/27/2016.
 */

/* EXERCISE 9 */
public class Calculator extends Exception {

    public Integer add(Integer a, Integer b){

        if(a + b > Integer.MAX_VALUE){
            throw new BufferOverflowException();
        } else if(a + b < Integer.MIN_VALUE) {
            throw new BufferUnderflowException();
        }

        return a + b;
    }

    public Integer divide(Integer a, Integer b){

        return a / b;
    }

    public Integer average(List<Integer> l){
        
        Integer nr = 0;

        for (int i = 0; i < l.size(); i += 2){

            if(i == l.size() - 1){
                nr += l.get(i);
            } else{
                add(l.get(i),l.get(i+1));
            }
        }

        nr = divide(nr,l.size() - 1);
        return nr;
    }
}