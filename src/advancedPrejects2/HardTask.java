package advancedPrejects2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HardTask {
    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun  ***
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz
Colections.sort(arr1)
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        arr1=elemanMethod(10,0,30);
        arr2=elemanMethod(5,0,30);
        System.out.println("arr1 = " + arr1);
        System.out.println("arr2 = " + arr2);
        //arr1.retainAll(arr2);
       // System.out.println("arr1 = " + arr1); ortak elemani bulur task
        ArrayList<Integer> fark=new ArrayList<>(arr1);

        System.out.println("fark = " + fark);
        arr1.removeAll(arr2);
        System.out.println("arr1 = " + arr1);
        arr2.removeAll(fark);
        System.out.println("arr2 = " + arr2);
        arr1.addAll(arr2);
        Collections.sort(arr1);
        System.out.println("arr1 = " + arr1);
        Collections.reverse(arr1);
        System.out.println("arr1 = " + arr1);


    }

    private static ArrayList<Integer> elemanMethod(int size, int min, int max) {
        ArrayList<Integer> arr3=new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            arr3.add(getRandom(min,max));
        }


        return arr3;
    }

    private static int getRandom(int min, int max) {

        return (int)(Math.random() * (max - min + 1));// anla burayi
    }
}
