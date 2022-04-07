package myAdvancedProjects;


import java.util.Scanner;

public class sameFirstAndLast {
   /*
​
    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.
​
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
​
    print just true or false
​
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birseyler gir");
        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

        // code start here

        // Koda burdan başlayin

        /*
        if (useThisArray[0].equals(useThisArray[useThisArray.length - 1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
         */

        System.out.println(useThisArray[0].equals(useThisArray[useThisArray.length - 1]));


    }
}
