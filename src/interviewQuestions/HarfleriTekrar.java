package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class HarfleriTekrar {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen String Girin");
        String str =scan.nextLine();
        System.out.println("kac kere tekrar etsin girdigin stringin illk ve son harfi");
        int tkr=scan.nextInt();
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));
        String ilkSonHarf=arr[0]+arr[arr.length-1];//method kullanmadan ilksonharf dinamik
       // System.out.println(ilkSonHarf);

        String output="";

        for (int i = 1; i <=tkr ; i++) {
            output+=ilkSonHarf;

        }
        System.out.println(output);
/*
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bİr string giriniz :");
        String str = scan.nextLine();

        System.out.print("Bir sayi giriniz :");
        int sayi = scan.nextInt();
       // ilkSonHarf(str, sayi);

        System.out.println("girilen stringin ilk ve son harfinin istenen sayi kadar
        birlesik hali :" +ilkSonHarf(str,sayi));

    } //main Sonu

    private static String ilkSonHarf(String str, int sayi) {
        String string = str.substring(0,1) + str.substring(str.length() - 1); //ea

        String output = "";

        for (int i = 1; i <=sayi; i++){ // ea dan kac tane yazacgim  eaeaea
            output+=string ; // b= b+s
        }
        return output;
 */
    }
}