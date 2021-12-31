import java.util.HashMap;
import java.util.Map;

public class hashMap2 {

    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap();
        items.put("coins", 5);
        items.put("pens", 2);
        items.put("chairs", 7);

        for (Map.Entry<String, Integer> pair: items.entrySet()) {
            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }
    }
}