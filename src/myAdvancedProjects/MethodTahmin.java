package myAdvancedProjects;


import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class MethodTahmin {
    static List<String> methodlar = new ArrayList<>(Arrays.asList("add()", "random()", "get()", "remove()",
            "sort()", "set()", "subList()", "isEmpty()", "valueOf()", "parseOf()", "subString()", "setCharAt()",
            "replaceAll()", "contains()", "equalsIgnoreCase()"));
    /*

     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~~~~~~METHOD TAHMIN ETME OYUNUNA HOSGELDIN~~~~~~");
        System.out.println("1- " + (methodlar.size()) + " arasinda bir sayi giriniz\n Lutfen Methodlarin ");
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
        int toplam = 0;
        do {
            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * methodlar.get(index).length() +
                    "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi

            harf = scan.next().charAt(0);//method için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı

            if (!tahminEdilecekMethod.toString().contains(str)) {//tahminEdilecekMethod'da kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
               // tahminSayısı++;
             if (tahminEdilecekMethod.toString().contains("*")) {//tahmin edilecek (***)method da yoksa yanlis tahmin ettin
                    tahminSayısı++;
                }
            }
            for (int i = 0; i < tahminEdilecekMethod.length(); i++) {
                if (methodlar.get(index).charAt(i) == harf) { //tahmin edilen harf listtdeki methodda varsa
                    if (!tahminEdilecekMethod.toString().contains(methodlar.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki method da var dogru tahmin ettin ama tahmin edilecek (***)method da yoksa yanlis tahmin ettin
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

        if ((tahminSayısı - dogruTahminSayısı) == 2 * methodlar.get(index).length()) {
            System.out.println("yanlis tahmin sayisi : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println(" agam GAME OVER yine bekleriz... tahmin edemedigin method : " + methodlar.get(index));

        }
    }
}
