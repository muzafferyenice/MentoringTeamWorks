package myAdvancedProjects;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class MethodTahmin {
    static List<String> methodlar = new ArrayList<>(Arrays.asList("Add()", "Random()", "get()", "remove()",
            "sort()", "set()", "subList()", "isEmpty()", "Valueof()", "ParseOf()", "subString()"));
    /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
 */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~~~~~~METHOD TAHMIN ETME OYUNUNA HOSGELDIN~~~~~~");
        System.out.println("1- " + (methodlar.size()) + " arasinda bir sayi giriniz\n Lutfen Methodlarin " +
                "Bas Harflerinin BUYUK harf oldugunu unutmayiniz");
        int secilenMethodIndex = scan.nextInt();
        methodGetir(methodlar, secilenMethodIndex - 1);
    }

    private static void methodGetir(List<String> methodlar, int index) {

        StringBuilder tahminEdilecekMethod = new StringBuilder(MethodTahmin.methodlar.get(index).replaceAll("\\S", "*"));


        //tum harf karakterleri * ile değiştir
        System.out.println(tahminEdilecekMethod);
        System.out.println(methodlar.get(index).length() + " harfli method seçtiniz. Methodu tahmin etmek için " +
                2 * methodlar.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";

        do {
            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * methodlar.get(index).length() +
                    "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi
            harf = scan.next().toUpperCase().charAt(0);//method için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            if (!tahminEdilecekMethod.toString().contains(str)) {//tahminEdilecekMethod'da kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayısı++;
            }
            for (int i = 0; i < tahminEdilecekMethod.length(); i++) {
                if (methodlar.get(index).toUpperCase().charAt(i) == harf) { //tahmin listeki edilen harf filmde varsa
                    if (!tahminEdilecekMethod.toString().contains(methodlar.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki method da var ama tahminedilecek (---)method da yoksa doğru tahmin ettin
                        dogruTahminSayısı++;
                    }
                    tahminEdilecekMethod.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekmethod indexe göre atandı
                }
            }
            if (tahminEdilecekMethod.toString().equalsIgnoreCase(methodlar.get(index))) {
                System.out.println(" tebrikler kaazandin ");
                System.out.println("tahmin ettigin method : " + tahminEdilecekMethod);
                break;
            }
            System.out.println(tahminEdilecekMethod);
        } while ((tahminSayısı - dogruTahminSayısı) != 2 * methodlar.get(index).length());//yanlış sayısı verilen hakka ulaşana
        // kadar do body calışır

        if ((tahminSayısı - dogruTahminSayısı) == 2 * methodlar.get(index).length()) ;
        {
            System.out.println("yanlis tahmin sayisi : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println(" agam GAME OVER yine bekleriz... tahmin edemedigin method : " + methodlar.get(index));

        }
    }
}
