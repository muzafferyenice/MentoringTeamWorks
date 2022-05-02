package mHotel;

import mHotel.Otel;
import mHotel.Revervasyon;
import mHotel.Yazdır;

import java.io.*;
import java.util.Scanner;

public class Runner1 {
    public static void main(String[] args) {

        try {//

            File f = new File("backup");
            if (f.exists()) {
                FileInputStream fin = null;//Klasorde text olusturup okuyup[ ekranda yazdiriyor
                try {
                    fin = new FileInputStream(f);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(fin);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try {
                    Otel.otel = (Revervasyon) ois.readObject();//text dekini ekrana getiriyor
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
            Scanner sc = new Scanner(System.in);
            int secim1, secim2;
            char cevap;
            x:
            do {
                System.out.println("\nRezevasyon İşlemlerine HoşGeldiniz :\n" +
                        "1.Oda Seçenekleri \n" +
                        "2.Reverasyona Açık odalar \n" +
                        "3.Oda\n" +
                        "4.Yemek Siparişi\n" +
                        "5.Otel Çıkış İşlemleri\n" +
                        "6.Menüden Çıkış\n");
                secim1 = sc.nextInt();
                switch (secim1) {
                    case 1:
                        System.out.println("\nOda Tipini Seçiniz :" +
                                "\n1.Luxury Çift Kişilk Oda " +
                                "\n2.Deluxe Çift Kişilk Oda " +
                                "\n3.Luxury Tek Kişilk Oda " +
                                "\n4.Deluxe Tek Kişilk Oda\n");
                        secim2 = sc.nextInt();
                        Otel.otelOzelikleri(secim2);
                        break;
                    case 2:
                        System.out.println("\nOda Tipini Seçiniz :" +
                                "\n1.Luxury Çift Kişilk Oda " +
                                "\n2.Deluxe Çift Kişilk Oda " +
                                "\n3.Luxury Tek Kişilk Oda " +
                                "\n4.Deluxe Tek Kişilk Oda\n");
                        secim2 = sc.nextInt();
                        Otel.uygunMu(secim2);
                        break;
                    case 3:
                        System.out.println("\nOda Tipini Seçiniz :" +
                                "\n1.Luxury Çift Kişilk Oda " +
                                "\n2.Deluxe Çift Kişilk Oda " +
                                "\n3.Luxury Tek Kişilk Oda " +
                                "\n4.Deluxe Tek Kişilk Oda\n");
                        secim2 = sc.nextInt();
                        Otel.odasecimi(secim2);
                        break;
                    case 4:
                        System.out.print("Oda Numaranız -");
                        secim2 = sc.nextInt();
                        if (secim2 > 60)
                            System.out.println("Oda Mevcut Değil");
                        else if (secim2 > 40)
                            Otel.siparis(secim2 - 41, 4);
                        else if (secim2 > 30)
                            Otel.siparis(secim2 - 31, 3);
                        else if (secim2 > 10)
                            Otel.siparis(secim2 - 11, 2);
                        else if (secim2 > 0)
                            Otel.siparis(secim2 - 1, 1);
                        else
                            System.out.println("Oda Mevcut Değil");
                        break;
                    case 5:
                        System.out.print("Oda Numaranız -");
                        secim2 = sc.nextInt();
                        if (secim2 > 60)
                            System.out.println("Oda Mevcut Değil");
                        else if (secim2 > 40)
                            Otel.otelCıkısı(secim2 - 41, 4);
                        else if (secim2 > 30)
                            Otel.otelCıkısı(secim2 - 31, 3);
                        else if (secim2 > 10)
                            Otel.otelCıkısı(secim2 - 11, 2);
                        else if (secim2 > 0)
                            Otel.otelCıkısı(secim2 - 1, 1);
                        else
                            System.out.println("Oda Mevcut Değil");
                        break;
                    case 6:
                        break x;

                }

                System.out.println("\nİşleminize Devam Etmek İstiyormusunuz (e/h)");
                cevap = sc.next().charAt(0);
                if (!(cevap == 'e' || cevap == 'E' || cevap == 'h' || cevap == 'H')) {
                    System.out.println("Hatalı Seçim");
                    System.out.println("\nDevam Etmek İstiyor musunuz: (e/h)");
                    cevap = sc.next().charAt(0);
                }

            }
            while (cevap == 'e' || cevap == 'E');

            Thread t = new Thread((Runnable) new Yazdır(Otel.otel));
            t.start();
        } catch (Exception e) {
            System.out.println("Çıkış İşleminiz Gerçekleşmiştir");
        }
    }
}


