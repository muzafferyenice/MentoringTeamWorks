package interviewQuestions;

import java.util.Scanner;

public class PrintVowelsOfString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        int index=0;
        while(index<str.length()){
            char c =str.charAt(index);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.print(c);
            }
            index++;
        }

        System.out.println("2. tol");
        String s =str.replaceAll("[^aeiou]","");//
        System.out.println(s);



    }
}
