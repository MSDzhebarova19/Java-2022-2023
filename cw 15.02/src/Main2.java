import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main2 {
    public static void main(String[] args) {
        try{
            methodB();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("main method");
    }

    public static void methodB() throws FileNotFoundException {
        methodC();
        System.out.println("end of method B");
    }

    private static void methodC() throws FileNotFoundException {
        String path = "C:\\Users\\MSDzhebarova19\\Documents\\ex.txt";
            FileReader reader = new FileReader(path);
        System.out.println("end of method C");
    }
}
