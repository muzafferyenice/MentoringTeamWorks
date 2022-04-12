package interviewQuestions;

import java.util.Scanner;

public class WhileCountSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam=0;
        int count= 0;
        while(count<10 && toplam<500){
            System.out.println("sayilar girin 11 sati girerseniz veya gir sayi toplam 500 u gecerse toplami yazdirir");
            sayi=scan.nextInt();
            toplam+=sayi;
            count++;

        }
        if(count<10 && toplam<500){
            System.out.println(count+"adet sayi girdin toplam = "+toplam);
        }else System.out.println("bu kadar sayi yeter "+count+"adet sayi girdiniz " +"toplami "+ toplam);

    }
}
