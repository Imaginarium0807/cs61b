
import java.util.*;
import java.lang.*;
import java.io.*;
public class hashmap201 {
    public static void hashmap201(AbstractMap<Integer, String> map){
        int[] array= {1,-9, -200, 3,4,-23,5,6};
        for (int x: array)
        {
            map.put(x, Integer.toString(x));
            
        }
        for (int k: map.keySet())
        {
            System.out.print(k + ", ");
        }
        System.out.print("END!!!");
    }
    public static void main(String[] args){
        //HashMap
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        hashmap201(map1);
        //LinkedHashMap
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
        hashmap201(map2);
        //TreeMap
        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        hashmap201(map3);
    }
    
    
}
