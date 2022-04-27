package storage_project;

import java.util.InputMismatchException;

import static storage_project.Actions.scan;

public class TryCatch {
    public static void main(String[] args) {
        // int sayi = intGirisi();
        String str = stringGiris();
        System.out.println("str = " + str);
        //System.out.println("sayi = " + sayi);
    }

    public static int intGirisi() {
        int giris = 0;//return icin
        boolean flag = true;
        boolean flag2 = false;// cift bayrak calismazsan sonsuz dogunden cikamadim
        do {                    //do while olmazsa program yarida kessiliyor
            try {
                if (flag2) {
                    scan.nextLine();        //bunu koymazsan sonsuz dongu catch calisiyor
                }
                flag2 = true;
                giris = scan.nextInt();
                if (giris < 0) {
                    giris = giris * (-1);
                }
                flag = false;
                flag2 = false;
            } catch (InputMismatchException e) {
                System.out.println("sayi gir");
            }
        } while (flag);
        return giris;
    }

    public static String stringGiris() {
        String giris = "";
        boolean flag = true;
        do {
            try {
                giris = scan.nextLine();
                String rakamsiz = giris.replaceAll("\\D", "");

            if (rakamsiz.length() > 0) {
                throw new InputMismatchException("sayi girme dedik");

            } else {
                flag = false;

            }

        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

    } while(flag);
        return giris;
}

}

/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static Scanner scan = new Scanner(System.in);
    static int giris;
    static String kelime;

    public static void main(String[] args) {
        int sayi = intGirisi();
        System.out.println(sayi);
       // scan.nextLine(); denemek icin ikisini ayni anda calistirinca dummy lazim
       // dummyleri projelerinizde calismaniz lazım
       // String kontrol = stringGirisi();
        // System.out.println(kontrol);
    }

    public static int intGirisi() {
        try {
            giris = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sayi gir");
            scan.nextLine();
            intGirisi();
        }
        return giris;
    }

    public static String stringGirisi() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\D", "");
            String kontrol2 = kelime.replaceAll("\\w", "");
            if (kontrol.length() != 0 || kontrol2.length() != 0) {
                throw new InputMismatchException("harf disinda karakter yok");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringGirisi();
        }

        return kelime;
    }
}
 */


