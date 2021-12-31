import java.util.*;

public class hashMap {

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities.get("USA"));

        for (Map.Entry<String, String> pair: capitalCities.entrySet()) {
            System.out.format("key: %s, value: %s%n", pair.getKey(), pair.getValue());
        }

        HashMap<Integer, Integer> myHashMap = new HashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]

        for (Map.Entry<Integer, Integer> pair2:  myHashMap.entrySet()) {
            System.out.format("key: %d, value: %d%n", pair2.getKey(), pair2.getValue());
        }

    }

}
