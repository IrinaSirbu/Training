
/**
 * Created by isirbu on 10/31/2016.
 */

class Nod{

    int value;
    Nod prec;
    Nod next;

    public Nod() {
        prec = null;
        next = null;
    }

    public Nod(int value, Nod prec) {
        this.value = value;
        this.prec = prec;
        this.next = null;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setPrec(Nod prec){
        this.prec = prec;
    }

    public void setNext(Nod next){
        this.next = next;
    }

    public Nod getNext(){
        return next;
    }
}

public class Queue {

    Nod first;
    Nod last;
    int nr;

    public Queue() {
        first = null;
        last = null;
        nr = 0;
    }

    public void add(int value){

        if(first == null){
            first = new Nod(value,null);
        } else if(first.next == null){
            last = new Nod(value,first);
            first.setNext(last);
            last.setPrec(first);
        } else {
            Nod current = new Nod(value,last);
            last.setNext(current);
            last = current;
        }
        nr ++;

    }

    public void poll(){

        first = first.getNext();
        first.setPrec(null);

    }

    public int peek(){
        return first.getValue();
    }

    public int getValue(int i){

        Nod iNod = first;

        if(i > nr){
            System.out.println("Invalid number \n");
        } else{
            for(int j = 1; j < i; j++){
                iNod = iNod.getNext();
            }
        }

        return iNod.getValue();

    }

    public int verif(int value){

        int ok = 1;
        Nod iNod = first;

        for(int j = 0; j < nr; j++){
            if(iNod.getValue() == value){
                ok = 0;
                break;
            }
            iNod = iNod.getNext();
        }

        return ok;
    }

    public String toString(){

        String s = new String();
        Nod nod = first;

        if(first != null){
            s += first.getValue() + " ";
        }

        while (nod.getNext() != null){
            nod = nod.getNext();
            s += nod.getValue() + " ";
        }

        return s;
    }
}
