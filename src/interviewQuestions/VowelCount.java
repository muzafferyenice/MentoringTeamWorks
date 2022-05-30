package interviewQuestions;

import java.util.Scanner;

public class VowelCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to count vowels: ");
        String input = sc.nextLine();
        String s = input.toLowerCase();
        int l = input.length();
        int c = 0;

        for (int i = 0; i <= l - 1; i++) {
            char d = s.charAt(i);
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') {
                c++;
            }
        }
        System.out.println("Number of Vowels: " + c);
        sc.close();
    }
}