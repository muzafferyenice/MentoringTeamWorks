package kitapProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapIslemleri {

    static int fiyat;
    static String kitap;
    static String yazar;
    static Scanner scan = new Scanner(System.in);
    static int count = 1000;
    static int devamMi = 1;

    public static List<KitapBilgileri> kitapListesi = new ArrayList();//kitapbillgileri classdan bilgi al yeni list olusutr

    public static List<KitapBilgileri> kitapEkle() {//bu ifade anlam sor

        while (devamMi != 0) {

            System.out.println("Eklemek istedigin kitap adi gir");
            String kitapAdi = scan.nextLine();
            System.out.println("Eklediginiz kitabin yazarini gir");
            String yazarAdi = scan.nextLine();
            System.out.println("Eklediginiz kitabin fiyati gir");
            int kitapFiyat = scan.nextInt();

            KitapBilgileri eklenenKitap = new KitapBilgileri(count, kitapAdi, yazarAdi, kitapFiyat);

            kitapListesi.add(eklenenKitap);
            System.out.println("kitap eklendi");
            System.out.println("******");
            count++;

            System.out.println("Kitap eklemeye devam etmek icin 1 menuye donmek icin 0");
            devamMi = scan.nextInt();
            scan.nextLine();//dummy
        }
        return kitapListesi;
    }

    public static void numaraSorgula() {
        int a = 1;
        while (a != 0) {
            System.out.println("kitap no gir");
            int numara = scan.nextInt();
            boolean varMi = false;

            for (KitapBilgileri kitap : kitapListesi) {
                if (numara == kitap.kitapNo) {
                    System.out.println("Kitap numarasi : " + kitap.kitapNo + "\nKitap Adi : " + kitap.kitapAdi + "\nKitap yazari : " + kitap.yazarAdi + "\nkitap fiyati : " + kitap.kitapFiyat);

                    System.out.println("*****");
                    varMi = true;
                }
            }
            if (varMi == false) {//mukemmel boolean sart bloklari
                System.out.println("gecerli bir kitap numarasi giriniz");
                System.out.println("*****");
            }
            System.out.println("Sorgulamaya devam etmek icin 1 menu icin 0");
            a = scan.nextInt();
        }

    }

    public static void bilgiSorgula() {
        Scanner scanner = new Scanner(System.in);
        do {
            String yazar1 = "";                    //bu blogda ne anliyorsun
            String kitap = " ";                    //bu blogda ne anliyorsun
            int fiyat1 = 0;                        //bu blogda ne anliyorsun
            boolean flag = true;                   //bu blogda ne anliyorsun

            while (flag == true) {                 //bu blogda ne anliyorsun


                System.out.println("Yazarin adi İle 1\n" + "Kitap Adi ile 2\n" + "kitap fiyati ile 3");

                String bilgiSecim = scan.next();
                switch (bilgiSecim) {

                    case "1":
                        System.out.println("Yazarin adini giriniz");

                        yazar1 = scanner.nextLine();
                        flag = false;
                        break;

                    case "2":
                        System.out.println("Kitap adini giriniz");
                        kitap = scanner.nextLine();
                        flag = false;
                        break;
                    case "3":
                        System.out.println("Kitabin fiyatini giriniz");
                        fiyat1 = scanner.nextInt();
                        flag = false;
                        break;
                    default:
                        System.out.println("gecerli bi rakam giriniz");
                        bilgiSorgula();

                }
            }
            boolean gecerliMi = false;
            for (KitapBilgileri each : kitapListesi) {
                if (each.yazarAdi.equalsIgnoreCase(yazar1) || each.kitapAdi.equalsIgnoreCase(kitap) || each.kitapFiyat == fiyat1) {
                    System.out.println("Kitap numarasi : " + each.kitapNo + "\nKitap Adi : " + each.kitapAdi + "\nKitap yazari : " + each.yazarAdi + "\nkitap fiyati : " + each.kitapFiyat);
                }
                gecerliMi = true;
            }
//}
            if (gecerliMi == false) ;
            {
                System.out.println("Geçerli bir veri giriniz:");
            }
            System.out.println("devam etmek istiyorsanız 1 menu icin 0");
            int bilgiSecimi = scan.nextInt();
            if (bilgiSecimi == 0) {
                break;
            }
        } while (true);
    }
    public static void kitapSil() {
        devamMi = 1;
        while (devamMi != 0) {
            System.out.println("Silmek istediginiz kitabin numarasini giriniz");

            int sil = scan.nextInt();
            int silinen=sil;
            sil =sil-999;
            try {
                if (sil>0&&sil<=kitapListesi.size()) {
                    for (int i = 0; i < kitapListesi.size(); i++) {

                        if (silinen == kitapListesi.get(i).kitapNo) {
                            kitapListesi.remove(kitapListesi.get(i));

                            System.out.println("Silme basarili");

                        }
                        System.out.println("devam etmek icin 1 menuye donmek icin 0");
                        int donus = scan.nextInt();
                        if (donus == 0) {
                            break;
                        }
                    }
                } else
                    throw new Exception();
            } catch (Exception e) {

                System.out.println("Hatali kitap numarasi girdiniz devam etmek icin 1 menuye donmek icin 0");
                int donus2 = scan.nextInt();
                if (donus2 == 0) {
                    break;
                }

            }
        }
    }
    public static void kitapListele() {

        for (KitapBilgileri kitaplar : kitapListesi) {

            System.out.println("Kitap No : " + kitaplar.kitapNo + "\nKitap Adi : " + kitaplar.kitapAdi + "\nKitap Yazari : " + kitaplar.yazarAdi
                    + "\nKitap Fiyati : " + kitaplar.kitapFiyat);
        }
        System.out.println("*****");
        System.out.println("menu icin 0");
        int menuDonus = scan.nextInt();

        while (menuDonus != 0) {
            System.out.println("menu icin 0");
            menuDonus = scan.nextInt();

            if (menuDonus == 0) {
                break;
            }
        }

    }
}
