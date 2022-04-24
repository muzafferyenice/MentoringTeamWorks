package advancedPrejects2;

import java.util.HashMap;
import java.util.Scanner;

public class MapArr {
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("metin gir");
        String metin=scan.nextLine();//"Ali came to school and Ayse came to school"
        System.out.println("kelimeSay(metin) = " + kelimeSay(metin));


    }

    public static HashMap<String,Integer> kelimeSay(String metin) {

        HashMap<String ,Integer>kelimeSayisi=new HashMap<>();
        String [] arrMetin=metin.split(" ");//her bosluk sonrasi arr nin bir elemani olacak
        for (int i = 0; i <arrMetin.length ; i++) {
            if (kelimeSayisi.containsKey(arrMetin[i])) {
                kelimeSayisi.put(arrMetin[i], kelimeSayisi.get(arrMetin[i]) + 1);
            } else {
                kelimeSayisi.put(arrMetin[i], 1);
            }
        }


        return kelimeSayisi;
    }
}
