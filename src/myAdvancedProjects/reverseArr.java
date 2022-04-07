package myAdvancedProjects;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

        /*
          Given String array
  ​
          reverse the String array
  ​
          print the reversed array
  ​
          NOTE: While printing the array dont use for loop
          Use Arrays.toString(your_array_name);

        /*
    ​
              Verilen String array
    ​
    String arrayi ters çevir
    ​
    ters arrayi yazdır
    ​
           NOT:
           Arrays.toString(your_array_name);  <--- kullanın
    ​
         */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir seyler gir");
        String myStr = scan.nextLine();
        String[] useThisArray = myStr.split(" ");
        //        code start here
        //        Koda burdan başlayın

        System.out.println(Arrays.toString(useThisArray));


        String ters[]=new String[useThisArray.length];

        for (int i = 0; i <useThisArray.length ; i++) {

            ters[i] = useThisArray[useThisArray.length-i-1];

        }
        System.out.println(Arrays.toString(ters));


    }
}