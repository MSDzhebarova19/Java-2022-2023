import java.util.*;
public class Jar {
    private Deque<String> stack;

    public Jar(){
        this.stack = new ArrayDeque<>();
    }
    public void add(String element){
        this.stack.push(element);
    }
    public String remove(){
        return this.stack.pop();
    }
}
