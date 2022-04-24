package maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"VAli, Can, Qa");
        sinifList.put(103,"Veli, Yan, Dev");

        return sinifList;
    }
}
