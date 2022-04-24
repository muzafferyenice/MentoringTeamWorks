package storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Islemler {


    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    static int id=1000;

    static HashMap<Integer,Urunler> urunler=new HashMap<>();
    public static void girisPaneli(){
        System.out.println(Y+ "========================== İŞLEMLER =======================\r\n"
                + "   ____________________              ____________________   \n"
                + "   | 1-URUN TANIMLAMA |              |  2-URUN LİSTELE  |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 3-URUN GIRISI    |              |  4-URUN RAFA KOY |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   \n"
                + "   ____________________              ____________________   \n"
                + "   | 5-URUN CIKISI    |              |  6-BITIRME       |   \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯              ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯  "+R);


        System.out.print("islem tercihinizi giriniz : ");
        int Islem = scan.nextInt();

        switch (Islem) {
            case 1:
                urunuTanimla();

                break;
            case 2:

                urunuTanimla();
                break;
            case 3:

                urunuTanimla();
                break;
            case 4:

                urunuTanimla();
                break;
            case 5:

                urunuTanimla();
                break;
            case 6:
             cikis();
                break;
            default:
                System.out.println("YANLIS SECİM......");

                break;


        }
    }

    private static void cikis() {
        System.out.println("gule gile");
    }

    private static void urunuTanimla() {

        System.out.println("urun ismi gir");
        String urunIsmi=scan.nextLine();
scan.nextLine();//dummy
        System.out.println("urun uretici gir");
        String uretici=scan.nextLine();

        System.out.println("urun birim gir");
        int birim=scan.nextInt();
        scan.nextLine();//dummy
        System.out.println("urun miktar gir");
        int miktar=scan.nextInt();

        System.out.println("urun raf gir");
        String raf=scan.nextLine();

        Urunler urun = new Urunler(id,urunIsmi,uretici,miktar,birim,raf);
        urunler.put(id, urun);
        System.out.println(id + " =" + urunler.get(id));
        id++;

    }

}
