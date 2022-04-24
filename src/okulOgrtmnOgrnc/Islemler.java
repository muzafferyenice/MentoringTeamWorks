package okulOgrtmnOgrnc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static ArrayList<Kisi> ogretmnListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");

        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hatali girdin");
                girisPaneli();//recursive  method call
                break;
        }


    }

    public static void cikis() {
        System.out.println("gule gule");
    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");
        System.out.print("islem tercihinizi giriniz : ");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                ara();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                sil();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("adam bir şey girrr :( ");
                islemMenusu();

                break;
        }
    }

    private static void sil() {
        System.out.println("   ***   " + kisiTuru + " silme sayfasi   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
    }

    private static void listele() {
        System.out.println(ogrenciListesi);
        System.out.println(ogretmnListesi);
    }

    private static void ara() {
        System.out.println("   ***   " + kisiTuru + " arama sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();



    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfası   ***");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
    if (kisiTuru.equals("OGRENCI")){
        System.out.println("ogrenci no girin");
        scan.nextLine();//dummy hayalet komut
        String ogrenciNo = scan.nextLine();
        System.out.println("sinif giriniz");
        String sinif = scan.nextLine();
        Ogrenci sefilOgreci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
        ogrenciListesi.add(sefilOgreci);
    }else{
        System.out.print("sicil No giriniz : ");
        String sicilNo = scan.nextLine();
        System.out.print("bolum giriniz : ");
        String bolum = scan.nextLine();
        Ogretmen muhtesemOgretmen=new Ogretmen(adSoyad, kimlikNo,yas, bolum,sicilNo);//p li cons tan ogr obj create edildi
        ogretmnListesi.add(muhtesemOgretmen);

    }


    }
}
