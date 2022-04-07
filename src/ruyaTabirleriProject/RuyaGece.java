package ruyaTabirleriProject;

import java.util.Scanner;

public class RuyaGece {//gordugun ruyayi gir java yorumlasin

    public RuyaGece(String gece) {
        Scanner scan = new Scanner(System.in);
        System.out.println("~~~~~***  JAVA RUYA TABIRLERINE HOSGELDINIZ  ***~~~~~");
        System.out.println("lutfen ruyanizi gece gorduyseniz 1 e gunduz gorduysenuz 2 ye basiniz");
        int no = scan.nextInt();
        if (no == 1) {
            System.out.println("ruyanizda gordukleriniz asagidaki listede varsa seciniz yoksa diger" +
                    " seceneginin sayisini giriniz " + " \nruyamda kodlama yapiyordum icin 1 \nmemet hocayi gordum icin 2 \n" +
                    " haluk hocayi gordum icin 3 \nbogaz koprusunden dusuyordum icin 4\ndiger icin 5");
            int ruy = scan.nextInt();
            if (ruy == 1) {
                System.out.println("yazilim kursu aliyorsaniz offer alacaginiza\nyazilim a ilginiz varsa yazilim kursuna" +
                        " kayit olmaniz gerektigine isaret eder");
            } else if (ruy == 2) {
                System.out.println("java dilini cok iyi ogrenme isteginize ve memet hocayi iyi dinlerseniz " +
                        " amaciniza ulasacaginiza isarettir. ");
            } else if (ruy == 3) {
                System.out.println("bu ruyanin iki yorumu var haluk hocayi ne halde gordugunuze gore degisir" +
                        " size kiziyorsa\n cok basarili olacaginiza guluyorsa cok calismaniz gerektigine tiye aliyorsa" +
                        " ortak proje yapmaniz gerektigine isarettir");
            } else if (ruy == 4) {
                System.out.println("en erken offeri alacaginiza isaret olabilir");
            } else if (ruy == 5) {
                System.out.println("lutfen yatarken uzerinizin ve pencerenin kapali oldugundan emin olun ");
            } else {
                System.out.println("hatali sayi girdiniz tekrar deneyin");
                RuyaGece ruyaTabirlerisonlandir = new RuyaGece();
            }
        } else if (no == 2) {
            RuyaGece ruyaTabirleriGunduz = new RuyaGece("gunduz");
        } else {
            System.out.println("yanlis tusa bastiniz bastan deneyin");
            RuyaGece ruyaTabirleriGece = new RuyaGece("gece");

        }

    }

    public RuyaGece() {
        System.out.println("son");

    }
}
