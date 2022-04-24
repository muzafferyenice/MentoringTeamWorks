package maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        //task sinif listesini duzenli bir sekilde yazdoirmak
       Map<Integer,String> sinif= MapOlustur.myMap();
        System.out.println("sinif = " + sinif);

        sinifListYazdir(sinif);

    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.println("Numara isim soyisim brans");
        System.out.println("**************************");
//map yapisindan yazdirdiginda kullanici birsey anlamz
        //bunun icin map i kodlarla manipule edip maps yapisini istedihgimiz formata sokmamiz gerkeir
        //1. adim key value lari map den alip
        //iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();

        System.out.println("keySet = " + keySet);
        System.out.println("valueSet = " + valueSet);
        System.out.println("valueSet.size() = " + valueSet.size());//3

        for (String each:valueSet) {//ayirip manipule edecegimiz hale getirdik
            System.out.println(each);
        }

    }
}
