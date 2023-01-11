import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] tokens = input.split("\\s+");
        List<Integer> ints = new ArrayList<>();
        for (int i=0; i<tokens.length; i++){
            int number = Integer.parseInt(tokens[i]);
            ints.add(number);
        }

        Collections.sort(ints);
        Collections.reverse(ints);



        for(int i=0; i<ints.size(); i++){
            System.out.printf(ints.get(i) + " ");
        }
    }
}
