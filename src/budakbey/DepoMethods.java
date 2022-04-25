package budakbey;

import javax.swing.*;
import java.util.Scanner;

import static budakbey.Baska.itemMap;

public class DepoMethods {
    public static void Depo() {
     Baska itm=new Baska();

        menulist();
    }

    public static void menulist() {
        String Menu = "";
        Menu = JOptionPane.showInputDialog(null,"Lütfen Yapmak İstediğiniz İşlemi Seçiniz :\n1-Ürün Tanımlama\n2-Ürün Listele\n3-Ürün Girişi\n4-Ürünü Rafa Koy\n5-Ürün Çıkışı\n6-Çıkış\"",
                "Budak AŞ.", JOptionPane.QUESTION_MESSAGE);
        if (Menu != null) {
            switch (Menu) {
                case "1":
                    urunListele();
                    urunTanimla();
                    urunListele();
                    menulist();
                    break;
                case "2":
                    urunListele();
                    menulist();
                    break;
                case "3":
                    urunListele();
                    urunGiris();
                    urunListele();
                    menulist();
                    break;
                case "4":
                    urunListele();
                    urunRafaKoy();
                    urunListele();
                    menulist();
                    break;
                case "5":
                    urunListele();
                    urunTCikisi();
                    menulist();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Lütfen tanımlı bir şeçim yapınız...!");
                    menulist();
                    break;
            }

        }
    }
    public static void urunTanimla() {
        System.out.println("");
        int urunid = ((int) itemMap.keySet().toArray()[itemMap.keySet().size() - 1]) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ürün Adı = ");
        String Adi = scan.nextLine();
        System.out.print("Üretici = ");
        String uretici = scan.nextLine();

        System.out.print("Birimi = ");
        String birimi = scan.nextLine();
        System.out.print("Rafı = ");
        String Raf = scan.nextLine();
        if(Raf.equals("")) Raf="Null";
        itemMap.put(urunid, Adi + "," + uretici + ",0," + birimi + ","+Raf);
    }
    public static void urunListele() {
        System.out.println("");
        String liste = String.format("%6S", "ID") + "\t\t" + "ismi" + "\t\t" + "üretici" + "\t\t" + "miktarı" + "\t\t" + "birimi" + "\t\t" + "raf";
        System.out.println(liste);
        System.out.println("===================================================================");
        for (int i = 0; i < itemMap.keySet().size(); i++) {
            System.out.printf(String.format("%6S", itemMap.keySet().toArray()[i]) + "\t\t" + String.format("%-11S", getiritemMap(i, 0)) + String.format("%-11S", getiritemMap(i, 1)) + "\t\t"
                    + String.format("%-11S", getiritemMap(i, 2)) + String.format("%-11S", getiritemMap(i, 3)) + String.format("%-11S", getiritemMap(i, 4)) + "\n");
        }
    }
    public static void urunGiris() {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen giriş yapacağınız ürünün ID sini giriniz = ");
        int ID = scan.nextInt();
        for (int i = 0; i < itemMap.keySet().size(); i++) {
            if ((int) itemMap.keySet().toArray()[i] == ID) {
                String birim= getiritemMap(i, 3);
                int eskiMiktar =Integer.valueOf(getiritemMap(i, 2));
                System.out.print("Kaç "+ birim+" giriş yapacaksınız? ");
                Integer  miktar =scan.nextInt();
                miktar+= eskiMiktar;
                itemMap.put(ID, getiritemMap(i, 0) + "," +  getiritemMap(i, 1) + "," + miktar + "," + birim + "," +  getiritemMap(i, 4));
            }

        }
    }
    public static void urunRafaKoy() {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen giriş yapacağınız ürünün ID sini giriniz = ");
        int ID = scan.nextInt();
        for (int i = 0; i < itemMap.keySet().size(); i++) {
            if ((int) itemMap.keySet().toArray()[i] == ID) {
                System.out.print("Hangi rafa koymak istiyorsunuz? ");
                Integer  raf =scan.nextInt();
                itemMap.put(ID, getiritemMap(i, 0) + "," +  getiritemMap(i, 1) + "," +  getiritemMap(i, 2) + "," +  getiritemMap(i, 3) + "," +  raf);
            }
        }
    }
    public static void urunTCikisi() {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Çıkış yapacağınız ürünün ID sini giriniz = ");
        int ID = scan.nextInt();
        for (int i = 0; i < itemMap.keySet().size(); i++) {
            if ((int) itemMap.keySet().toArray()[i] == ID) {
                String birim= getiritemMap(i, 3);
                int eskiMiktar =Integer.valueOf(getiritemMap(i, 2));
                System.out.print("Kaç "+ birim+" Çıkış yapacaksınız? ");
                Integer  miktar =scan.nextInt();
                if(eskiMiktar>=miktar){
                    miktar = eskiMiktar-miktar;
                    itemMap.put(ID, getiritemMap(i, 0) + "," +  getiritemMap(i, 1) + "," + miktar + "," + birim + "," +  getiritemMap(i, 4));
                }
                else{
                    System.out.println("Depoda olan üründen "+eskiMiktar+" "+birim+ " var. Fazla çıkış yapamazsınız. \n Lütfen Anamenüden çıkış işemini tekrarlayıznız.");
                }

            }

        }
    }
    private static String getiritemMap(int i, int j) {
        String deger = itemMap.values().toArray()[i].toString().split(",")[j];
        return deger;
    }


}


