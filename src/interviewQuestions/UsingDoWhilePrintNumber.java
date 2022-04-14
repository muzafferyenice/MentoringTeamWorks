package interviewQuestions;

import java.util.Scanner;

public class UsingDoWhilePrintNumber {
     /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int sayi =Math.abs(scan.nextInt());//mutlak deger alir
       /*  do{
             System.out.print(sayi+" ");
             sayi+=5;
         }while(sayi<100);
       */  System.out.println("*****");
         System.out.println(isEvencift(sayi));
         System.out.println("carpanlarinin sayisi");
        int i =1;
        int sayac=0;
        while (i<=sayi){
            if (sayi%i==0){
                sayac++;
                System.out.print(i+" ");
            }i++;
        }
         System.out.println("");
         System.out.print(sayac);
     }

    private static boolean isEvencift(int sayi) {
         if (sayi%2==0)return true;
         else return false;
    }

}
