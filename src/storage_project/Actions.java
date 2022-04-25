package storage_project;


import java.util.*;


public class Actions extends Product {
    static Scanner scan = new Scanner(System.in);
    Map<Integer, Product> urunler = new HashMap<>();


    int id = 1000;

    public void menu() {
        System.out.println("Islmler menusu");
        System.out.println("1 urunTanimla\n" +
                "2 urunListele\n" +
                "3 urunGirisi \n" +
                "4 urunuRafaKo\n" +
                "5 urunCikisi \n" +
                "Q cikis ");
        String islem = scan.next();

        switch (islem) {
            case "1":
                urunTanimlama();
                menu();
                break;
            case "2":
                urunListele();
                menu();
                break;
            case "3":

                menu();
                break;
            case "4":
                break;
            case "5":
                break;
            case "Q":
            case "q":

                break;
            default:
                System.out.println("yanlis tus");
                menu();
        }

    }

    public void urunTanimlama() {
        System.out.println("lutfen urunun ismi, ureticisi ve birimi girilecek");
        // String urunBilgileri=scan.nextLine()+scan.nextLine()+scan.nextLine()+scan.nextLine();//tum urun bilgileri tek satirda istendi
        scan.nextLine();// methodlar arasi iki string arasi bir dummy iyi olur yoksa alinjan ismin yazmadi
        String ismi = scan.nextLine();
        String marka = scan.nextLine();
        //scan.nextLine();//dummy
        String birim = scan.nextLine();
        Product obj1 = new Product();
        Product obj2 = new Product(ismi, marka, obj1.getMiktar(), birim, obj1.getRaf());
        urunler.put(id, obj2);
        id++;


        System.out.println(urunler);


    }

    public void urunListele() {
        Set<Integer> urunKeys = urunler.keySet();
        Collection<Product> urunValues = urunler.values();

        System.out.println("tum urunler icin 1 id ile urun lsitelemek icin 2");//printf ile yapariz yarin yap
        int secim = TryCatch.intGirisi();
        if (secim == 1) {
            System.out.println(urunler);
        } else if (secim == 2) {
            System.out.println("id gir");
            //map den  obje uzerinden urun cagir
            int id1 =TryCatch.intGirisi();

            for (Map.Entry each : urunler.entrySet()) {//set e attik
                if (each.getKey().equals(id1)) {
                    System.out.println(each.getKey() + " " + urunler.get(id1).toString());
                } else {
                    System.out.println("yoktur id ile urun");
                }
            }
            System.out.println("\"ID\", \"Isim\", \"Uretici\", \"Birim\", \"Miktar\", \"Raf\"");
            System.out.println("**************************************************");
            System.out.println(urunler);

        }

    }
}




