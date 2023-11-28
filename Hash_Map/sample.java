package Hash_Map;

import java.util.HashMap;

public class sample {
    static boolean ans = false;
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("Address", "cbe");
        map.put("Address2", "cbe2");
        map.put("Address3", "cbe3");

        map.forEach((k,v)->{
            System.out.println("Key: "+k+", Value: "+v);
        });

        String search = "Address";
        
        map.forEach((k,v)->{
            if(k.contains(search) || k.contains(search)){
                ans = true;
            }
        });
        System.out.println("Search is "+ ans);
        map.merge(search, search, null)
        // map.put("Name","Hrithik" );

        // map.compute("Address", (key, val) -> val.concat(" Arun"));
        // System.out.println(map);
        // map.replace("New address", "cbe2");
        // System.out.println("New Map: "+map);
        // map.computeIfAbsent("Name", key -> "Hrithik");
        // map.computeIfPresent("Address", (key,val)-);
        // System.out.println( map.entrySet());
        // System.out.println(map.get(1));
        

    }

}
