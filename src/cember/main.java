package cember;


//import static _14_Encapsulation.Q02.UserMain.scanner;

import java.util.Scanner;

public class main {
static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1- cember alan ve cevre \n2 kare alan ve cevre" +
                "\n3 dikdortgen alan ve cevre");

        int tercih = scan.nextInt();


        switch (tercih) {

            case 1:
                System.out.println("Cemberin yaricapini giriniz");
                Cember cb01 = new Cember(scan.nextDouble(),3.14,1);
                cb01.alanHesaplama();
                cb01.cevreHesaplama();
                System.out.println(cb01);
                break;
            case 2:
                System.out.println("Karenin bir kenarini giriniz");
                Kare k01 = new Kare(scan.nextInt());
                k01.alanHesaplama();
                k01.cevreHesaplama();
                System.out.println(k01);
                break;
            case 3:
                System.out.println("Dikdortgenin uzun ve kisa kenarini giriniz");
                Dikdortgen dk01 = new Dikdortgen(scan.nextDouble(), scan.nextDouble());
                dk01.alanHesaplama();
                dk01.cevreHesaplama();
                System.out.println(dk01);
                break;
            default:
                System.out.println("Hatali deger girdiniz");

        }


    }

}
