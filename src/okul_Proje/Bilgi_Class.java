package okul_Proje;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bilgi_Class extends Kisi{
    //secimler de next al nextline degil
    Scanner scan = new Scanner(System.in);
    String branslar[] = {"Kimya", "Fizik", "Biyoloji", "Matematik", "Geometri"};
    String siniflar[] = {"11A", "11B", "12A", "12B", "10A", "10B", "9A", "9B", "8A", "8B", "7A", "7B", "6A", "5A", "4A", "3A", "2A", "1A"};
    List<Kisi> ogretmen = new ArrayList<>();
    List<Kisi> ogrenci = new ArrayList<>();
    String kisi;

    public  Bilgi_Class() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();

        //boolean flag = true;
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
            Bilgi_Class obj =new Bilgi_Class();
        }
    }

    public  void altMenu() {
        System.out.println("====================" +
                "============= " + kisi + "=============\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n");
        //scan.nextLine();//dummy
        String secim2 = scan.next().toUpperCase();//nextline alirsan dongudekli dummy ler calisir extrdadan
        switch (secim2) {
            case "1":
                ekleme();
                //altMenu();
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
                Bilgi_Class obj =new Bilgi_Class();
                break;
            default:
                System.out.println("hacim yanlis tusa bastin tekrar deneyin");
                altMenu();
        }


    }


    public void cikis() {
        System.out.println("hoscakalin yine bekleriz");
        String dosyaYolu = "src/okul_Proje/yeniTask";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
