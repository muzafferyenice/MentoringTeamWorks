package advancedPrejects2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapTekrar {
    static Scanner scan = new Scanner(System.in);
    static Map<String,Integer> msp=new HashMap<>();
    public static void main(String[] args) {
/*
        Count the words in a String one by one
        Bir Stringdeki kelimeleri tek tek sayın ve konsolda yazdiran method creat ediniz.
        String Str = "Ali came to school and Ayse came to school"
        Ali=    1
        came=   2
        to=     2
        school= 2
        and=    1
        Ayse=   1
                */

        kelimesayisi();
    }

    private static void kelimesayisi() {

        String str="Ali came to school and Ayse came to school";
        //String []arr=str.replace(" ","").split("");
        String []arr=str.split(" ");
        for (String es: arr) {
            if (msp.putIfAbsent(es,1)!=null){
                msp.put(es,msp.get(es)+1);

            }else{
                msp.put(es,1);
            }
        }
        System.out.println("msp = " + msp);


    }
}
