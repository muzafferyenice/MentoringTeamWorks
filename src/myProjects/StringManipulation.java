package myProjects;

import java.util.Scanner;

public class StringManipulation {
//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime girin");
        String str1 = scan.nextLine();
        System.out.println("kelime girin");
        String str2 = scan.nextLine();

        System.out.println(str1.concat(str2));

        System.out.println((str1.substring(1))+str2.substring(1));
    }
}


