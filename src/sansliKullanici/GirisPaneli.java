package sansliKullanici;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {

    public static void panel(){
        Scanner scan = new Scanner(System.in);

        //int islem;//scan.nextInt();
        Kayit yeniKayit=new Kayit();
        List<Kullanici> kisi=new ArrayList<>();

        boolean cikilsinMi=false;
        while (!cikilsinMi){

            System.out.println("lutfen \n1: kayit al\n2: sansli kisi" +
                    " bul\n3 kisileri listele\n4 cikis");
            System.out.println("isleminizi seciniz :  ");
            int islem=scan.nextInt();
            switch(islem){

                case 1:
                    kisi=yeniKayit.kayitAl();//kisi listin degerini yenikayit
                    // obj ile kayitAl() methood call yaptik
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                default:
                    System.out.println("hatali veri giridiniz");
                    break;
            }



        }




    }
}
