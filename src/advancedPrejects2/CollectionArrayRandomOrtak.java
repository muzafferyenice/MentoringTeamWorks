package advancedPrejects2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayRandomOrtak {
    /*  Method:
          10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
       elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
       sonucta bir ArrayList return eden bir method yaziniz
       main:
       1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli  ***
           elemanlari 0-20 arasinda 2 adet ArrayList olusturun
       2.  Bu iki list'in ortak elemanlarini bulunuz           ***retainAll
       3.  Bu iki list'in farkli olan elemanlarini bulunuz      bulamadik
       4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz  sort ile

    */
    public static void main(String[] args) {
        ArrayList<Integer>arrList1=new ArrayList<>();
        ArrayList<Integer>arrList2=new ArrayList<>();

        arrList1=arrListHazirla(10,0,20);//arr 10 sayi 0 ile 20 arasinda olusutur
        arrList2=arrListHazirla(5,0,20);
        System.out.println(arrList1);
        System.out.println(arrList2);

       // arrList1.retainAll(arrList2);// iki listin ortak methodlarini alir
       // System.out.println("ortak elemanli : "+arrList1);

       //arrList1.removeAll(arrList2);// list 1 deb 2 cikarilarak 1 de olup 2 de olmayan elemanlar yazdirildi
       //System.out.println(arrList1);
       //arrList2.removeAll(arrList1);
       //System.out.println(arrList2);
        ArrayList<Integer>arrayListFark1=new ArrayList<>(arrList1);//list1 de olup 2 de oomayan
        ArrayList<Integer>arrayListFark2=new ArrayList<>(arrList2);//list 2 de olup 1 de olmayan

        arrayListFark1.removeAll(arrList2);//list1 - list2
        System.out.println("arrayListFark1 = " + arrayListFark1);
        arrayListFark2.removeAll(arrList1);//list2 - list1
        System.out.println("arrayListFark2 = " + arrayListFark2);

        arrayListFark2.addAll(arrayListFark1);
        Collections.sort(arrayListFark2);
        Collections.reverse(arrayListFark2);
    }
public static int getRandomInt(int min, int max){// bu method max ile min arasi sayi return eder

        return (int) (Math.random()*(max-min+1));// bu cok onemi bir method
}
    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) {//bu method cre edilecek arrList kadar min ile max arasinda
        //int sayi cre eder
        ArrayList<Integer>bosList=new ArrayList<Integer>();
        for (int i = 0; i <size ; i++) {
            bosList.add(getRandomInt(min,max));
        }
        return bosList;
    }
}
