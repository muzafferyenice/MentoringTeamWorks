package okul_Proje;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilgi_Class {
    static Scanner scan = new Scanner(System.in);

      static  List<Kisi > ogretmen=new ArrayList<>();
       static List<Kisi > ogrenci=new ArrayList<>();

    static String kisi;

    public static void menu() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();
        if (secim.contains("1")) {
            kisi = "OGRENCI";
            altMenu();
        } else if (secim.contains("2")) {
            kisi = "OGRETMEN";
            altMenu();
        } else if (secim.contains("Q")) {
            cikis();
        } else {
            System.out.println("Hatali giris yaptiniz");
            menu();
        }


    }

    public static void altMenu() {
        System.out.println("==============================" +
                "============= " + kisi + "=============\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n" +
                "\t Q-ÇIKIŞ");
        String secim2 = scan.nextLine().toUpperCase();
        switch (secim2) {
            case "1":
                ekleme();
                menu();
              //  break;
            case "2":
                arama();
              //  break;
            case "3":
                listeleme();
             //   break;
            case "4":
                silme();
              //  break;
            case "5":
                menu();
               // break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("hacim yanlis tusa bastin tekrar deneyin");
                altMenu();
        }





    }

    private static void silme() {

    }

    private static void listeleme() {
    }

    private static void arama() {
    }

    private static void ekleme() {
        System.out.println("eklemek istediginiz " +kisi+ " bilgilerini giriniz");
        scan.nextLine();//dummy
        System.out.println("isim gir");
        String adSoyad= scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kimlikNo= scan.nextLine();
        System.out.println("yas gir");
        int yas =scan.nextInt();
        if(kisi.equalsIgnoreCase("Ogrenci")){
            System.out.println("ogrenci no gir");
            int ogrenciNo=scan.nextInt();
            scan.nextLine();//dummy
            System.out.println("ogrenci sinif girin");
            String sinif= scan.nextLine();

            Ogrenci obj=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrenci.add(obj);
        }else {
            System.out.println("brans gir");
            scan.nextLine();//dummy
            String brans = scan.nextLine();
            System.out.println("sicil no gir");
            String sicilNo=scan.nextLine();

            Ogretmen obj2=new Ogretmen(adSoyad,kimlikNo,yas,brans,sicilNo);
            ogretmen.add(obj2);
            System.out.println(ogretmen);


        }


    }


    public static void cikis() {
        System.out.println("hoscakalin yine bekleriz");
    }
}
