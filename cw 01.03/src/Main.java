import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Dog dog = new Dog("Balkan", 10);

        String path = "C:\\Users\\MSDzhebarova19\\Documents\\a.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(dog);


//        List<Integer> ints = new ArrayList<>();
//        ints.add(10);
//        ints.add(12);
//        ints.add(17);
//        String path = "C:\\Users\\MSDzhebarova19\\Documents\\a.txt";
//        FileOutputStream fileOutputStream = new FileOutputStream(path);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(ints);
//
//        objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        List<Integer> deserializedInts = (List<Integer>) objectOutputStream.readObject();
//        for(int i =0; i<deserializedInts.size(); i++)
//        {
//            System.out.println(deserializedInts.get(i));
//
//        }
    }
}
