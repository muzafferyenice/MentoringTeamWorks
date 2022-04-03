package P03_UcusProjesi;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucmak istedigniz sehri (B C D ) seciniz");
        String cty = scan.nextLine().toUpperCase();
        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("tek yon ise 1 ciftyon ise 2 girin");
        int yon = scan.nextInt();
        double fiyatB = 500 * 0.1;
        double fiyatC = 700 * 0.1;
        double fiyatD = 900 * 0.1;

        if (cty.equals("B") || cty.equals("C") || cty.equals("D")) {
            if (yas < 12) {
                if (cty.equals("B")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatB * 0.5);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatB * 0.5 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("C")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatC * 0.5);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatC * 0.5 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("D")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatD * 0.5);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatD * 0.5 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else System.out.println("sekillllll");

            } else if (yas >= 12 && yas < 24) {
                if (cty.equals("B")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatB * 0.1);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatB * 0.1 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("C")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatC * 0.1);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatC * 0.1 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("D")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatD * 0.1);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatD * 0.1 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else System.out.println("sekillllll");

            } else if (yas > 65) {
                if (cty.equals("B")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatB * 0.7);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatB * 0.7 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("C")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatC * 0.7);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatC * 0.7 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("D")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatD * 0.7);
                    } else if (yon == 2) {
                        System.out.println("fiyat " + (fiyatD * 0.7 * 0.8) * 2);
                    } else System.out.println("yanlis yon");
                } else System.out.println("sekillllll");
            } else if (yas<= 65&&yas>=24) {
                if (cty.equals("B")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatB );
                    } else if (yon == 2) {
                        System.out.println("fiyat " + fiyatB  * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("C")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatC );
                    } else if (yon == 2) {
                        System.out.println("fiyat " + fiyatC  * 2);
                    } else System.out.println("yanlis yon");
                } else if (cty.equals("D")) {
                    if (yon == 1) {
                        System.out.println("fiyat " + fiyatD );
                    } else if (yon == 2) {
                        System.out.println("fiyat " + fiyatD * 2);
                    } else System.out.println("yanlis yon");
                } else System.out.println("sekillllll");



            }else System.out.println("duzgun yas gir");
        } else System.out.println("yanlis yer sectin");
    }
}
