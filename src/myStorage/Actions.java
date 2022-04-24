package myStorage;

import javax.swing.*;
import java.util.Scanner;

public class Actions {
    static Scanner scan = new Scanner(System.in);

    public static void menu() {
        System.out.println("\n    ====================================\n" +
                "\t WELLCOME TO MY STORAGE\n" +
                "\t PLEASE SELECT THE ACTION YOU WANT TO DO\n" +
                "\t EKLEMEK ISTEDIGINIZ URUNUN ID SI ILE GIRIS YAPINIZ\n" +
                "\t BUNUN ICIN ASAGIDAKI LISTEDEN YARDIM ALABILIRSINIZ\n" +
                "\t====================================\n" +
                "\t 1- ADD PRODUCT\n" +//listeleme
                "\t Q- EXIT");
        String secim = scan.next().toUpperCase();


        if (secim.equals("1")) {
            mainMenu();

        } else if (secim.equalsIgnoreCase("Q")) {
            exit();
        } else {
            JOptionPane.showMessageDialog(null,"HATALI VEYA EKSİK GİRİŞ!!");
            menu();
        }
    }


    public static void mainMenu() {

        System.out.println("====================" +
                "============= " + " ekle" + "=============\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n");
        //scan.nextLine();//dummy
        String secim2 = scan.next().toUpperCase();//nextline alirsan dongudekli dummy ler calisir extrdadan
        switch (secim2) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            default:
                System.out.println("hacim yanlis tusa bastin tekrar deneyin");

        }


    }


    public static void exit() {
        System.out.println("hoscakalin yine bekleriz");

     /*    String dosyaYolu = "src/okul_Proje/yeniTask";
       try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}

