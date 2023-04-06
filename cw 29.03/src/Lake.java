import java.util.List;
import java.util.Iterator;

public class Lake implements Iterable{
    private int[] numbers;
    public Lake(int[] numbers){
        this.numbers = numbers;
    }

    private class Frog implements Iterator<Integer>{
        @Override
        public boolean hasNext(){
            return false;
        }
        @Override
        public boolean next(){
            return null;
        }

    }


    @Override
    public Iterator<Integer> iterator(){
        return new Frog();
    }
}
