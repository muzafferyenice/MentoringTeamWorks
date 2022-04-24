package advancedPrejects2;

import java.util.HashMap;

public class ArrayYazdirMap {
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
// input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
// output : {ahmet=şeref, ahmet can=erdem, haluk=bilgin};
    public static void main(String[] args) {
        String ad[]={"ahmet","ali can"," haluk"};
        String soyad[]={"seref","erdem","bilgin"};

        HashMap<String,String> adSoyad=new HashMap<>();
        for (int i = 0; i <ad.length ; i++) {
            adSoyad.put(ad[i],soyad[i]);
        }
        System.out.println("adSoyad = " + adSoyad);

    }
}
