package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {
//java da collection yapida data turu object secilirse her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting problemleri ile karsilayabilriz

        List<Object> liste = new ArrayList<>();
        liste.add("Ergin");
        liste.add(15);
        liste.add(10.2);
        System.out.println("liste = " + liste);
        liste.set(1,(Integer)(liste.get(1))+10);
        System.out.println(liste);

        Map<Integer,String> sinifList=new HashMap<>();
        //bir sinifta ogrno ve isim brans olarak map olustur
        //key tek bir unique degerdir
        //ama value birden fazla bildiden olusur
        //tum elkementler ayni value icinde olustururulmalidir
        //veri siralamasi ayni olmali bosluklar da dahil
        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"VAli, Can, Qa");
        sinifList.put(103,"Veli, Yan, Dev");
        System.out.println("sinifList = " + sinifList);

        System.out.println("sinifList.keySet() = " + sinifList.keySet());
        System.out.println("sinifList.values() = " + sinifList.values());


    }
}
