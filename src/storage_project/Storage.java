package storage_project;

import java.util.Scanner;

import static storage_project.Actions.*;

public class Storage {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        System.out.println(
                "============= İŞLEMLER =============\r\n"
                        + "     1-URUN EKLEME\r\n"//password
                        + "     2-ARAMA\r\n"
                        + "     3-URUN CİKİSİ\r\n"//kar
                        + "     0-CİKİS");

        int secim = scan.nextInt();


        switch (secim) {

            case 1:
                depoyaUrunEkleme();

                break;
            case 2:
                urunArama();

                break;
            case 3:
                urunCikisi();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("gecerli bir tuslama yapiniz");

        }


    }

    public static void cikis() {

        System.out.println("yine bekleriz");


    }
}