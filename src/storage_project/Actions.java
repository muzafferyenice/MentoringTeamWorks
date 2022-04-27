package storage_project;


import java.util.*;


public class Actions extends Product {
    static Scanner scan = new Scanner(System.in);
    Map<Integer, Product> urunler = new HashMap<>();
    String raflar[] = {"ortaRaf", "solRaf", "sagRaf", "ustRaf", "basRaf"};


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
                urunGirisi();//iki dk da yapti yaa yusuf bey cok tesekkurler //tekrar ve anlatim onemli//anlatarark calis
                menu();
                break;
            case "4":
                urunuRafaKoy();
                menu();
                break;
            case "5":
                urunCikisi();
                menu();
                break;
            case "Q":
            case "q":

                break;
            default:
                System.out.println("yanlis tus");
                menu();
        }
    }
    public void urunCikisi() {
        System.out.println(urunler);
        System.out.println("cikis yapmak istedigin urun id gir yukarda var bak");
        int idCikis=TryCatch.intGirisi();
        System.out.println("ne kadar cikis yapaacaksan");
        int cikisMiktar=TryCatch.intGirisi();
        if (urunler.containsKey(idCikis)){
            urunler.get(idCikis).setMiktar(urunler.get(idCikis).getMiktar()-cikisMiktar);
        }
        System.out.println(urunler);

    }
    public void urunuRafaKoy() {
        System.out.println("rafa koymak istediginiz urun id giriniz");
        int idRafIcin = TryCatch.intGirisi();
        if (urunler.containsKey(idRafIcin)) {
            System.out.println("asagidaki listeden raf seciniz\n" + Arrays.toString(raflar));
            scan.nextLine();
            String raf = TryCatch.stringGiris();//raf1 deseydin bu trycatch kabul etmez
            for (int i = 0; i < raflar.length; i++) {
                if (raf.equalsIgnoreCase(raflar[i])) {
                    urunler.get(idRafIcin).setRaf(raflar[i]);//yanlis raf girme ihtimali calis
                    System.out.println("ID            Isim        Uretici      Birim       Miktar           Raf");
                    System.out.println("*************************************************************************");
                    System.out.printf("%-12d %-12s %-12s %-12s %-15d %-15s\n", idRafIcin, urunler.get(idRafIcin).getUrunIsmi(), urunler.get(idRafIcin).getMarka(),
                            urunler.get(idRafIcin).getBirim(), urunler.get(idRafIcin).getMiktar(), urunler.get(idRafIcin).getRaf());
                }
            }
            menu();

        } else {
            System.out.println("bu id de urun yok once ekleme yapin");
            urunTanimlama();
        }


    }

    public void urunTanimlama() {
        System.out.println("lutfen urunun ismi, ureticisi ve birimi girilecek");
        // String urunBilgileri=scan.nextLine()+scan.nextLine()+scan.nextLine()+scan.nextLine();//tum urun bilgileri tek satirda istendi
        scan.nextLine();// methodlar arasi iki string arasi bir dummy iyi olur yoksa alinjan ismin yazmadi
        String ismi = TryCatch.stringGiris();
        String marka = TryCatch.stringGiris();
        //scan.nextLine();//dummy
        String birim = TryCatch.stringGiris();
        Product obj1 = new Product();
        Product obj2 = new Product(ismi, marka, obj1.getMiktar(), birim, obj1.getRaf());
        urunler.put(id, obj2);
        id++;


        System.out.println(urunler);


    }

    public void urunListele() {
        System.out.println("tum urunler icin 1 id ile urun lsitelemek icin 2");//printf ile yapariz yarin yap
        int secim = TryCatch.intGirisi();
        if (secim == 1) {
            System.out.println(urunler);
        } else if (secim == 2) {
            System.out.println("id gir");
            //map den  obje uzerinden urun cagir
            int id1 = TryCatch.intGirisi();
            if (urunler.containsKey(id1)) {
                System.out.println("ID          Isim           Uretici        Birim       Miktar       Raf");
                System.out.println("**************************************************");
                System.out.printf("%-12d %-12s %-12s %-12s %-12d %-1s\n", id1, urunler.get(id1).getUrunIsmi(), urunler.get(id1).getMarka(),
                        urunler.get(id1).getBirim(), urunler.get(id1).getMiktar(), urunler.get(id1).getRaf());
            }
        }
    }

    public void urunGirisi() {//miktar ekleme toplama sayi artrma
        System.out.println(urunler);
        System.out.println(" bu id lerden id gir");
        int urunId = TryCatch.intGirisi();
        System.out.println("eklemek miktar");
        int miktar = TryCatch.intGirisi();
        if (urunler.containsKey(urunId)) {
            urunler.get(urunId).setMiktar(urunler.get(urunId).getMiktar() + miktar);//ayni mantik cikis sagla fazla verme ama
        }
        System.out.println("ID            Isim        Uretici      Birim       Miktar           Raf");
        System.out.println("*************************************************************************");
        System.out.printf("%-12d %-12s %-12s %-12s %-15d %-15s\n", urunId, urunler.get(urunId).getUrunIsmi(), urunler.get(urunId).getMarka(),
                urunler.get(urunId).getBirim(), urunler.get(urunId).getMiktar(), urunler.get(urunId).getRaf());

    }

}





