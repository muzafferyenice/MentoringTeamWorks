package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class CountsOfCharacters {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */

    public static void main(String[] args) {
        System.out.println("lutfen bir string ifade giriniz");
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int count=0;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                count++;
            }else{
                System.out.println(arr[i-1]+" karakteri "+(count+1));
                count=0;
            }
            if (arr.length-1==i){
                System.out.println(arr[i]+" karakteri "+(count+1));
            }
        }


    }


}