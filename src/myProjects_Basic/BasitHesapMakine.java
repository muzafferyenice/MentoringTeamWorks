package myProjects_Basic;

import java.util.Scanner;

public class BasitHesapMakine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yapacagin islemi sec + - * / ");
        char islem = scan.next().charAt(0);
        if (islem == '+' || islem == '-' || islem == '*' || islem == '/') {
            System.out.println("ilk sayi gir");
            double sayi1 = scan.nextDouble();
            System.out.println("ikinci sayi gir");
            double sayi2 = scan.nextDouble();
            HesapMakine(islem, sayi1, sayi2);
        } else System.out.println("hatali");


    }

    private static void HesapMakine(char islem, double sayi1, double sayi2) {
       /* if (islem=='+'){
            System.out.println("toplam : "+(sayi1+sayi2));
        }else if (islem=='-'){
            System.out.println("toplam : "+(sayi1-sayi2));
        }else if (islem=='*'){
            System.out.println("toplam : "+(sayi1*sayi2));
        }else if (islem=='/'){
            System.out.println("toplam : "+(sayi1/sayi2));
        }else System.out.println("yanlis islem sectin");

*/


            switch (islem) {
                case '+':
                    System.out.println("toplam : " + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println("toplam : " + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println("toplam : " + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println("toplam : " + (sayi1 / sayi2));
                    break;


            }

    }
}// elif hoca practice basic q01
