package okul_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilgi_Class {
    //secimler de next al nextline degil
    static Scanner scan = new Scanner(System.in);
    static String arr[] = {"Kimya", "Fizik", "Biyoloji", "Matematik", "Geometri"};
    static List<Kisi> ogretmen = new ArrayList<>();
    static List<Kisi> ogrenci = new ArrayList<>();
    static String kisi;

    public static void menu() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();
      /*  switch (secim){
            case "1":
                kisi = "OGRENCI";
                altMenu();
                break;
            case "2":
                kisi = "OGRETMEN";
                altMenu();
                break;
            case "Q":
              cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                menu();

        }*/
        boolean flag = true;
        if (secim.equals("1")) {
            kisi = "OGRENCI";
            altMenu();
        } else if (secim.equals("2")) {
            kisi = "OGRETMEN";
            altMenu();
        } else if (secim.equalsIgnoreCase("Q")) {
            cikis();

        } else {
            System.out.println("Hatali giris yaptiniz");
            menu();
        }
    }

    public static void altMenu() {
        System.out.println("====================" +
                "============= " + kisi + "=============\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n" );
        //scan.nextLine();//dummy
        String secim2 = scan.next().toUpperCase();//nextline alirsan dongudekli dummy ler calisir extrdadan
        switch (secim2) {
            case "1":
                ekleme();
                altMenu();
                break;
            case "2":
                arama();
                altMenu();
                break;
            case "3":
                listeleme();
                altMenu();
                break;
            case "4":
                silme();
                altMenu();
                break;
            case "5":
                menu();
                break;
            default:
                System.out.println("hacim yanlis tusa bastin tekrar deneyin");
                altMenu();
        }


    }

    private static void silme() {
        System.out.println("****** " + kisi + " silme  sayfasina hosgelmissen" + "*******");
        System.out.println("silmek istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();// bosluk durumuna gore try catch e bagla
        tc = tc.replaceAll(" ", "");
        boolean flag = true;
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi sil : ogrenci) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    ogrenci.remove(sil);
                    System.out.println("silindi niye sildin ki ");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");
            }
        } else {
            for (Kisi sil : ogretmen) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    ogretmen.remove(sil);
                    System.out.println("silindi niye sildin ki ");

                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");

            }
        }

    }

    private static void listeleme() {
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi herOgrenci : ogrenci) {
                System.out.println(herOgrenci);
            }
        } else {
            for (Kisi herOgretmen : ogretmen) {
                System.out.println(herOgretmen);
            }
        }

    }

    private static void arama() {
        System.out.println("****** " + kisi + " arama sayfasina hosgelmissen" + "*******");
        System.out.println("aramak istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();
        tc = tc.replaceAll(" ", "");
        if (kisi.equalsIgnoreCase("ogrenci")) {
            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogrenci) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogrenciyi geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        } else {

            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogretmen) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogretmeni geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }


        }
    }

    private static void ekleme() {//try catch calis
        System.out.println("****** " + kisi + " ekleme sayfasina hosgelmissen" + "*********");
        scan.nextLine();//dummy
        System.out.println("isim gir");
        String adSoyad = scan.nextLine();
        System.out.println("kimlik no giriniz ");
        String kimlikNo = "";
        try {
            kimlikNo = scan.nextLine();
            kimlikNo = kimlikNo.replace(" ", "");//bosluklu girerse diye
            if (kimlikNo.length() == 5) {
            } else {
                throw new StringIndexOutOfBoundsException();
            }
        } catch (StringIndexOutOfBoundsException e) {
            //e.printStackTrace(); hatanin bedeli degil turu
            System.out.println("yanlis kimlik no girdiniz tekrar deneyin");
            altMenu();
        }


        if (kisi.equalsIgnoreCase("Ogrenci")) {
            System.out.println("yas gir");

            int yas = 0;
            try {
                yas = scan.nextInt();
                if (yas >= 8 && yas < 17) {

                } else {
                    throw new ArithmeticException();
                }
            } catch (Exception e) {
                System.out.println("yanlis yas girdiniz burasi kres mi ");
                scan.nextLine();//dummy
                //  ekleme();
                altMenu();
            }
            System.out.println("ogrenci no gir");
            int ogrenciNo = scan.nextInt();
            scan.nextLine();//dummy
            System.out.println("ogrenci sinif girin");
            String sinif = scan.nextLine();

            Ogrenci obj = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenci.add(obj);
        } else {
            System.out.println("yas giriniz");
            boolean flag1 = false;
            int yas = 0;
            try {
                yas = scan.nextInt();
                if (yas > 21 && yas < 65) {
                } else {
                    throw new ArithmeticException(" bu yaslarda ogretmenlik yapamazsiniz ");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                flag1 = true;
            }
            if (flag1) {
                menu();
            }
            System.out.println("brans gir");
            scan.nextLine();//dummy
            boolean flag = true;//true aldik 207 213 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            String brans = "";
            try {
                brans = scan.nextLine();

                for (int i = 0; i < arr.length; i++) {
                    if (brans.equalsIgnoreCase(arr[i])) {
                        flag = false;
                    }
                }
                if (flag) {
                    throw new ArrayStoreException();
                }
            } catch (ArrayStoreException e) {
                System.out.println("Agam niddin Boyle bir brans yoodur tekrar dene");
                //   e.printStackTrace();
                altMenu();
            }
            System.out.println("sicil no gir");
            String sicilNo = scan.nextLine();

            Ogretmen obj2 = new Ogretmen(adSoyad, kimlikNo, yas, brans, sicilNo);
            ogretmen.add(obj2);
        }
    }
    public static void cikis() {

        System.out.println("hoscakalin yine bekleriz");
    }

}
