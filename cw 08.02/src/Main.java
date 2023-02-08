import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String,Map<Integer,String>> people = new TreeMap<>();
        people.put("123456", new HashMap<>());
        people.get("123456").put(123456, "Ivan Ivanov");

        people.put("456", new HashMap<>());
        people.get("456").put(456, "Stoyan Ivanov");

         people.put("7890", new HashMap<>());
        people.get("7890").put(7890, "Ivan Ivanov");

        for(String key : people.keySet()){
           Map<Integer, String> innerMap = people.get(key);
           for(Integer integerKey : innerMap.keySet()){
               System.out.println(key + " - " + integerKey + " - " + innerMap.get(integerKey));
           }
        }

        for(Map<Integer, String> value :people.values()){
            for(String innerValue : value.values()){
                System.out.println(innerValue);
            }
        }

        for(Map.Entry<String, Map<Integer, String>> entry: people.entrySet()){
            Map<Integer, String> innerMap = entry.getValue();
            for(Map.Entry<Integer, String> innerEntry : innerMap.entrySet()){
                System.out.println(entry.getKey() + " - " + innerEntry.getKey() + innerEntry.getValue());
            }
        }
    }
}