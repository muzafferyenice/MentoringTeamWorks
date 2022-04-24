package storage;

import java.util.HashMap;
import java.util.Map;

public class Storage {
    static Map<Integer,String> storageMap=new HashMap<>();
    public static Map<Integer,String> myMap() {



        storageMap.put(1000,"Hekimoglu, Un, 50kg");
        storageMap.put(1001,"Soke, Un, 50kg");
        storageMap.put(1002,"Ari, Seker, 50kg");
        storageMap.put(1003,"Hayat, Yag, 50kg");
        storageMap.put(1004,"Yeni, Pirinc, 50kg");
        storageMap.put(1005,"Artos, Fasulye, 50kg");

        return storageMap;
    }
}
