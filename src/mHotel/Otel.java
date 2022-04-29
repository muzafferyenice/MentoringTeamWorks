package mHotel;

import java.util.Scanner;

public class Otel {
    public static Revervasyon otel = new Revervasyon();
    static Scanner scan = new Scanner(System.in);

    static void MusteriTercihi(int i, int rn) {

        TekKişilikOda k = new TekKişilikOda();
        k.Isim = null;
        k.iletisim = null;
        k.Cinsiyet = null;
        CiftKişilikOda h = new CiftKişilikOda();
        h.Isim2 = null;
        h.iletisim2 = null;
        h.Cinsiyet2 = null;
        System.out.println("Lütfen Adınızı ve Soyadınızı Giriniz");
        k.Isim = scan.nextLine();
        scan.next();
        System.out.println("Lütfen Telefon Numaranızı Giriniz");
        k.iletisim = scan.nextLine();
        scan.next();
        System.out.println("Lütfen Cinsiyetinizi Yazınız");
        k.Cinsiyet = scan.nextLine();
        scan.next();
        if (i < 3) {
            System.out.println("Lütfen Adınızı ve Soyadınızı Giriniz");
            h.Isim2 = scan.nextLine();
            scan.next();
            System.out.println("Lütfen Telefon Numaranızı Giriniz");
            h.iletisim2 = scan.nextLine();
            scan.next();
            System.out.println("Lütfen Cinsiyetinizi Yazınız");
            h.Cinsiyet2 = scan.nextLine();
            scan.next();
        }

        switch (i) {
            case 1:
                otel.luxury_ciftoda[rn] = new CiftKişilikOda(k.Isim, k.iletisim, k.Cinsiyet, h.Isim2, h.iletisim2, h.Cinsiyet2);
                break;
            case 2:
                otel.deluxe_ciftoda[rn] = new CiftKişilikOda(k.Isim, k.iletisim, k.Cinsiyet, h.Isim2, h.iletisim2, h.Cinsiyet2);
                break;
            case 3:
                otel.deluxe_tek[rn] = new TekKişilikOda(k.Isim, k.iletisim, k.Cinsiyet);
                break;
            case 4:
                otel.luxury_tek[rn] = new TekKişilikOda(k.Isim, k.iletisim, k.Cinsiyet);
                break;
            default:
                System.out.println("Hatalı Seçim");
                break;
        }

    }

    public static void odasecimi(int i) {
        int j;
        int rn;
        System.out.println("\nLütfen Oda Seçiminizi Yapınız : ");
        switch (i) {
            case 1:
                for (j = 0; j < otel.luxury_ciftoda.length; j++) {
                    if (otel.luxury_ciftoda[j] == null) {
                        System.out.print(j + 1 + ",");
                    }
                }
                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn--;
                    if (otel.luxury_ciftoda[rn] != null)
                        throw new UygunDegil();
                    MusteriTercihi(i, rn);
                } catch (Exception e) {
                    System.out.println("Seçiminiz Uygun Değildir");
                    return;
                }
                break;
            case 2:
                for (j = 0; j < otel.deluxe_ciftoda.length; j++) {
                    if (otel.deluxe_ciftoda[j] == null) {
                        System.out.print(j + 11 + ",");
                    }
                }
                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn = rn - 11;
                    if (otel.deluxe_ciftoda[rn] != null)
                        throw new UygunDegil();
                    MusteriTercihi(i, rn);
                } catch (Exception e) {
                    System.out.println("Seçiminiz Uygun Değildir");
                    return;
                }
                break;
            case 3:
                for (j = 0; j < otel.luxury_tek.length; j++) {
                    if (otel.luxury_tek[j] == null) {
                        System.out.print(j + 31 + ",");
                    }
                }
                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn = rn - 31;
                    if (otel.luxury_tek[rn] != null)
                        throw new UygunDegil();
                    MusteriTercihi(i, rn);
                } catch (Exception e) {
                    System.out.println("Seçiminiz Uygun Değildir");
                    return;
                }
                break;
            case 4:
                for (j = 0; j < otel.deluxe_tek.length; j++) {
                    if (otel.deluxe_tek[j] == null) {
                        System.out.print(j + 41 + ",");
                    }
                }
                System.out.print("\nOda Numaranızı Giriniz: ");
                try {
                    rn = scan.nextInt();
                    rn = rn - 41;
                    if (otel.deluxe_tek[rn] != null)
                        throw new UygunDegil();
                    MusteriTercihi(i, rn);
                } catch (Exception e) {
                    System.out.println("Seçiminiz Uygun Değildir");
                    return;
                }
                break;
            default:
                System.out.println("Geçerli bir değer giriniz");
                break;
        }
        System.out.println("Oda Rezerve Edildi");
    }

    public static void otelOzelikleri(int i) {
        switch (i) {
            case 1:
                System.out.println("Çift Kişilik Oda : 1\nAC : Evet\nÜcretsiz Kahvaltı : Evet\nGünlük Ücret :2000 TL");
                break;
            case 2:
                System.out.println("Çift Kişilik Oda: 1\nAC : Evet\nÜcretsiz Kahvaltı : Hayır\nGünlük Ücret :1800 TL ");
                break;
            case 3:
                System.out.println("Tek Yataklı Oda : 1\nAC : Evet\nÜcretsiz Kahvaltı : Evet\nGünlük Ücret :1500 TL ");
                break;
            case 4:
                System.out.println("Tek Yataklı Oda : 1\nAC : Evet\nÜcretsiz Kahvaltı : Hayır\nGünlük Ücret :1300 TL ");
                break;
            default:
                System.out.println("Hatalı Seçim");
                break;
        }
    }

    public static void uygunMu(int i) {
        int j, sayac = 0;
        switch (i) {
            case 1:
                for (j = 0; j < 10; j++) {
                    if (otel.luxury_ciftoda[j] == null)
                        sayac++;
                }
                break;
            case 2:
                for (j = 0; j < otel.deluxe_ciftoda.length; j++) {
                    if (otel.deluxe_ciftoda[j] == null)
                        sayac++;
                }
                break;
            case 3:
                for (j = 0; j < otel.luxury_tek.length; j++) {
                    if (otel.luxury_tek[j] == null)
                        sayac++;
                }
                break;
            case 4:
                for (j = 0; j < otel.deluxe_tek.length; j++) {
                    if (otel.deluxe_tek[j] == null)
                        sayac++;
                }
                break;
            default:
                System.out.println("Hatalı Seçim");
                break;
        }
        System.out.println("Uygun Oda Sayısı : " + sayac);
    }

    static void fatura(int rn, int rtype) {
        double tutar = 0;
        String list[] = {"Gözleme", "İçli Köfte", "Beyran", "Ayran"};
        System.out.println("\n*******");
        System.out.println(" Fatura:-");
        System.out.println("*******");

        switch (rtype) {
            case 1:
                tutar += 2000;
                System.out.println("\nOda Ücreti - " + 2000);
                System.out.println("\n===============");
                System.out.println("Lokanta :- ");
                System.out.println("===============");
                System.out.println("Yemek     Adet     Fiyat ");
                System.out.println("-------------------------");
                for (Yemek obb : otel.luxury_ciftoda[rn].yemek) {
                    tutar += obb.fiyat;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.no - 1], obb.kisiSayisi, obb.fiyat);
                }

                break;
            case 2:
                tutar += 1800;
                System.out.println("\nOda Ücreti -  " + 1800);
                System.out.println("\nLokanta:- ");
                System.out.println("===============");
                System.out.println("Yemek     Adet     Fiyat ");
                System.out.println("-------------------------");
                for (Yemek obb : otel.deluxe_ciftoda[rn].yemek) {
                    tutar += obb.fiyat;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.no - 1], obb.kisiSayisi, obb.fiyat);
                }
                break;
            case 3:
                tutar += 1500;
                System.out.println("Oda Ücreti - " + 1500);
                System.out.println("\nLokanta :- ");
                System.out.println("===============");
                System.out.println("Yemek     Adet     Fiyat ");
                System.out.println("-------------------------");
                for (Yemek obb : otel.luxury_tek[rn].yemek) {
                    tutar += obb.fiyat;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.no - 1], obb.kisiSayisi, obb.fiyat);
                }
                break;
            case 4:
                tutar += 1200;
                System.out.println("Oda Ücreti - " + 1200);
                System.out.println("\nLokanta :- ");
                System.out.println("===============");
                System.out.println("Yemek     Adet     Fiyat ");
                System.out.println("-------------------------");
                for (Yemek obb : otel.deluxe_tek[rn].yemek) {
                    tutar += obb.fiyat;
                    String format = "%-10s%-10s%-10s%n";
                    System.out.printf(format, list[obb.no - 1], obb.kisiSayisi, obb.fiyat);
                }
                break;
            default:
                System.out.println("Hatalı İşlem");
        }
        System.out.println("\nToplam Fatura- " + tutar);

    }

    public static void otelCıkısı(int rn, int rtype) {
        int j;
        char w;
        switch (rtype) {
            case 1:
                if (otel.luxury_ciftoda[rn] != null)
                    System.out.println(otel.luxury_ciftoda[rn].Isim + " Tarafından Tutuldu");
                else {
                    System.out.println("Oda Boş");
                    return;
                }
                System.out.println("Çıkış İlemleri İçin Ödeme Yapmak İstermisiniz ?(e/h)");
                w = scan.next().charAt(0);
                if (w == 'e' || w == 'E') {
                    fatura(rn, rtype);
                    otel.luxury_ciftoda[rn] = null;
                    System.out.println("Çıkış işlemleriniz tamamlandı\nYine Bekleriz....");
                }

                break;
            case 2:
                if (otel.deluxe_ciftoda[rn] != null)
                    System.out.println(otel.deluxe_ciftoda[rn].Isim + " Tarafından Tutuldu");
                else {
                    System.out.println("Oda Boş");
                    return;
                }
                System.out.println("Çıkış İşlemleri İçin Ödeme Yapmak İstermisiniz ?(e/h)");
                w = scan.next().charAt(0);
                if (w == 'e' || w == 'E') {
                    fatura(rn, rtype);
                    otel.deluxe_ciftoda[rn] = null;
                    System.out.println("Çıkış işlemleriniz tamamlandı\nYine Bekleriz....");
                }

                break;
            case 3:
                if (otel.luxury_tek[rn] != null)
                    System.out.println(otel.luxury_tek[rn].Isim + " Tarafından Tutuldu");
                else {
                    System.out.println("Oda Boş");
                    return;
                }
                System.out.println("Çıkış İlemleri İçin Ödeme Yapmak İstermisiniz ?(e/h)");
                w = scan.next().charAt(0);
                if (w == 'e' || w == 'E') {
                    fatura(rn, rtype);
                    otel.luxury_tek[rn] = null;
                    System.out.println("Çıkış işlemleriniz tamamlandı\nYine Bekleriz....");
                }
                break;
            case 4:
                if (otel.deluxe_tek[rn] != null)
                    System.out.println("Oda Sahibi" + otel.deluxe_tek[rn].Isim);
                else {
                    System.out.println("Oda Boş");
                    return;
                }
                System.out.println("Çıkış İlemleri İçin Ödeme Yapmak İstermisiniz ?(e/h)");
                w = scan.next().charAt(0);
                if (w == 'e' || w == 'E') {
                    fatura(rn, rtype);
                    otel.deluxe_tek[rn] = null;
                    System.out.println("Çıkış işlemleriniz tamamlandı\nYine Bekleriz....");
                }
                break;
            default:
                System.out.println("\nLütfen Geçerli bir değer giriniz : ");
                break;
        }
    }

    public static void siparis(int rn, int rtype)//"Gözleme","İçli Köfte","Beyran","Ayran"
    {
        int i, q;
        char secim;
        try {
            System.out.println("\n=====================\n   Menu:  \n======================\n\n1.Gözleme\t\tTL.50\n2.İçli Köfte \t\tTL.60\n3.Beyran\t\tTL.70\n4.Ayran\t\tTL.30\n");
            do {
                i = scan.nextInt();
                System.out.print("Porsiyon-");
                q = scan.nextInt();

                switch (rtype) {
                    case 1:
                        otel.luxury_ciftoda[rn].yemek.add(new Yemek(i, q));
                        System.out.println(otel.luxury_ciftoda[rn].yemek.add(new Yemek(i, q)));//otel.luxury_ciftoda
                        break;
                    case 2:
                        otel.deluxe_ciftoda[rn].yemek.add(new Yemek(i, q));//otel.deluxe_ciftoda
                        break;
                    case 3:
                        otel.luxury_tek[rn].yemek.add(new Yemek(i, q));//otel.luxury_tek
                        break;
                    case 4:
                        otel.deluxe_tek[rn].yemek.add(new Yemek(i, q));//otel.deluxe_tek
                        break;
                }
                System.out.println("Başka bir şey sipariş etmek ister misin ? (e/h)");
                secim = scan.next().charAt(0);
            } while (secim == 'e' || secim == 'E');
        } catch (NullPointerException e) {
            System.out.println("\nHatalı İşlem");
        } catch (Exception e) {
            System.out.println("Hatalı İşlem");
        }
    }
}



