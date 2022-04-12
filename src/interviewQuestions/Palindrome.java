package interviewQuestions;

import java.util.Scanner;

public class Palindrome extends PalindromesFather{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("string giriniz");
        String str = scan.nextLine();

        palindromeWithStringBuilder(str);
        palindromeWithFoorLoop(str);

    }

    protected static void palindromeWithFoorLoop(String str) {
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.charAt(i);
        }
       // System.out.print(ters);
        if (ters.equalsIgnoreCase(str)){
            System.out.println("bu polindrome  " +ters);
        }else System.out.println("palindrome degil "+ters);
    }

    //private static void palindromeWithStringBuilder(String str) {
   //    StringBuilder sb = new StringBuilder(str);
   //    String tersStr=sb.reverse().toString();
   //    if (str.equalsIgnoreCase(tersStr)){
   //        System.out.println("polindrome dur  "+tersStr);
   //    }else System.out.println("palindrome degil  "+tersStr);
   //}


}
