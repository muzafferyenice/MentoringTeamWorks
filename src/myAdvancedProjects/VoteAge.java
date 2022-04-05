package myAdvancedProjects;

import java.util.Scanner;

public class VoteAge {
    public static void main(String[] args) {
        /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("\"lutfen yasinizi giriniz\" = " + "lutfen yasinizi giriniz");
        int age = scan.nextInt();

        if (age>=18 && age<50) System.out.println(" oy kullanmaya uygun= " + age +" bir kez kullanabilir");
        else if (age >=50 && age<70) System.out.println(" iki kez oy kullanabilir" + age);
        else if (age >= 70) System.out.println("uc kez oy kullanabilir" + age);
        else System.out.println("yasin kucuk " + age);


    }
}
