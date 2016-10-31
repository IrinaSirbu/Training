import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by isirbu on 10/28/2016.
 */
public class Main {

    /* EXERCISE 1 */
    public static <T> int odd(ArrayList<T> array){

        int nr = 0;
        for(T i : array){

            if (i.hashCode() % 2 == 1){
                nr ++;
            }
        }

        return nr;
    }

    /* EXERCISE 3 */
    public static <T> void exchange(ArrayList<T> array, T a, T b){

        int aux1 = array.indexOf(a);
        int aux2 = array.indexOf(b);
        array.remove(a);
        array.remove(b);
        array.add(aux1,b);
        array.add(aux2,a);
    }

    /* EXERCISE 8 */
    public static <T> int findMaxElem(LinkedList<T> list){

        int nr = 0;

        for (Object i : list){
            if(nr < i.hashCode()){
                nr = i.hashCode();
            }
        }
        return nr;
    }

    /* EXERCISE 12 */
    public static <T> int findFirst(List<T> list, int begin, int end, List<T> p){

       int result = 0;

        for(int i = begin; i < end; i++){

            for(T j : p){
                int gcd = gcd((Integer) list.get(i),(Integer) j);
                if(gcd == 1){
                    result = (Integer) list.get(i);
                    break;
                }
            }

            if(result != 0){
                break;
            }
        }

        return result;
    }

    public static int gcd(int a, int b){

        if(a == 0){
            return b;
        }

        while(b != 0){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }

        return a;
    }

    public static void main(String[] args) {

        /* EXERCISE 1 */
        System.out.println(" EXERCISE 1 ");
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            array.add(i);
        }
        System.out.println(odd(array) + "\n");

        /* EXERCISE 3 */
        System.out.println(" EXERCISE 3 ");
        System.out.println(array);
        exchange(array,2,8);
        System.out.println(array + "\n");

        /* EXERCISE 8 */
        System.out.println(" EXERCISE 8");
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(findMaxElem(list) + "\n");

        /* EXERCISE 12 */
        System.out.println(" EXERCISE 12");
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(7);
        for (int i = 0; i < 10; i += 2){
            list2.add(i);
        }
        System.out.println(findFirst(list1,0,3,list2));

    }
}
