package myStorage;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    public static Map<Integer,String> myProducts() {
        Map<Integer,String> storageProducts=new HashMap<>();
/*
id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	0 			cuval 		null
 */
        storageProducts.put(1000, "Hekimoglu, Un, 50 kg");
        storageProducts.put(1001, "Soke, Un, 50kg");
        storageProducts.put(1002, "Ari, Seker, 50kg");
        storageProducts.put(1003, "Hayat, Yag, 50kg");
        storageProducts.put(1004, "Yeni, Pirinc, 50kg");
        storageProducts.put(1005, "Artos, Fasulye, 50kg");
        storageProducts.put(1006, "Erikli, Su, 5lt");

        return storageProducts;

    }
}
/*
Map<Integer, Map<Integer,String >> storageMap = new HashMap<>();

    Map<Integer, String> storageMap1 = new HashMap<>();

 */