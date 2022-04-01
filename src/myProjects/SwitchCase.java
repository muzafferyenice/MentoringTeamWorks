package myProjects;

public class SwitchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

        int sayi = 123;
        int yuzlerBasamak=(sayi/100)%10;
        int onlarBasamak=(sayi/10)%10;
        int birlerBasamak=sayi%10;
        if (99<sayi && sayi<1000){

            switch (yuzlerBasamak){
                case 0:    System.out.println("yuzlerBasamak = " + "sifir"); break;
                case 1:    System.out.println("yuzlerBasamak = " + "bir"); break;
                case 2:    System.out.println("yuzlerBasamak = " + "iki"); break;
                case 3:    System.out.println("yuzlerBasamak = " + "uc"); break;
                case 4:    System.out.println("yuzlerBasamak = " + "dort"); break;
                case 5:    System.out.println("yuzlerBasamak = " + "bes"); break;
                case 6:    System.out.println("yuzlerBasamak = " + "alti"); break;
                case 7:    System.out.println("yuzlerBasamak = " + "yedi"); break;
                case 8:    System.out.println("yuzlerBasamak = " + "sekiz"); break;
                case 9:    System.out.println("yuzlerBasamak = " + "dokuz"); break;
            }
            switch (onlarBasamak){
            case 0:    System.out.println("onlarBasamak = " + "sifir"); break;
            case 1:    System.out.println("onlarBasamak = " + "bir"); break;
            case 2:    System.out.println("onlarBasamak = " + "iki"); break;
            case 3:    System.out.println("onlarBasamak = " + "uc"); break;
            case 4:    System.out.println("onlarBasamak = " + "dort"); break;
            case 5:    System.out.println("onlarBasamak = " + "bes"); break;
            case 6:    System.out.println("onlarBasamak = " + "alti"); break;
            case 7:    System.out.println("onlarBasamak = " + "yedi"); break;
            case 8:    System.out.println("onlarBasamak = " + "sekiz"); break;
            case 9:    System.out.println("onlarBasamak = " + "dokuz"); break;

        }
            switch (birlerBasamak){
                case 0:    System.out.println("birlerBasamak = " + "sifir"); break;
                case 1:    System.out.println("birlerBasamak = " + "bir"); break;
                case 2:    System.out.println("birlerBasamak = " + "iki"); break;
                case 3:    System.out.println("birlerBasamak = " + "uc"); break;
                case 4:    System.out.println("birlerBasamak = " + "dort"); break;
                case 5:    System.out.println("birlerBasamak = " + "bes"); break;
                case 6:    System.out.println("birlerBasamak = " + "alti"); break;
                case 7:    System.out.println("birlerBasamak = " + "yedi"); break;
                case 8:    System.out.println("birlerBasamak = " + "sekiz"); break;
                case 9:    System.out.println("birlerBasamak = " + "dokuz"); break;
            }
        }
    }
}
