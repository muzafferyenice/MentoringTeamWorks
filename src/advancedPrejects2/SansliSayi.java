package advancedPrejects2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SansliSayi {
    static List<Integer> sayilar = new ArrayList<>();

    public static void main(String[] args) {
         /*
    Kullanici durdurana kadar sayi girecek ve sonra girilen sayilar random olarak, ilk once 1,sonra 2,sonra 3 ve s. sayi
    silinecek. En son kalan sayi sansli sayi olacak.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir ");

        String q = "";
        while (!q.equalsIgnoreCase("q")) {
            int sayi = scan.nextInt();
            System.out.println("cikmak icin q bas devam icin 1 ");
            q = scan.next();
            sayilar.add(sayi);
        }
        elemanMethod(0, sayilar.size());
        System.out.println("sayilar = " + sayilar);
    }
    private static int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1));// anla burayi
    }
    private static void elemanMethod(int min, int max) {
        int size=sayilar.size();
        for (int i = 0; i < size-1 ; i++) {
            if (sayilar.size()>3){
            sayilar.remove(getRandom(min,max));
            }
        }
    }
}