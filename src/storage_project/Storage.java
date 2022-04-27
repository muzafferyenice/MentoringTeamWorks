package storage_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static storage_project.Actions.urunler1;

public class Storage extends Product{
    public static void main(String[] args) {
        List<String> urun = new ArrayList<>(Arrays.asList("elma", "un", "ekmek", "su"));
        System.out.println("ne kadar cikis yapaacaksan");


        urunler1.put(1001,"Soke, Un, 50kg");
        urunler1.put(1002,"Ari, Seker, 50kg");
        urunler1.put(1003,"Hayat, Yag, 50kg");
        urunler1.put(1004,"Yeni, Pirinc, 50kg");
        urunler1.put(1005,"Artos, Fasulye, 50kg");


        //System.out.println("urunler1 = " + urunler1);

    }
}