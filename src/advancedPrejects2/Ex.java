package advancedPrejects2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex {
    /*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

			 */
    public static void main(String[] args){

    LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("erdem", "mehmet", "samet", "said", "yagmur"));
    Scanner scan = new Scanner(System.in);
        System.out.println("isim");
        String isim= scan.nextLine();
        if(ll1.remove(isim)){
            System.out.println("silindi");
            System.out.println("silinmis list"+ll1);
        }else System.out.println("o isim yokki");
}
}
