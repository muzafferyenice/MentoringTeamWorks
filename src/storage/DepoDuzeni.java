package storage;

import java.util.*;

public class DepoDuzeni extends DepoBilgileri {
    Scanner scan = new Scanner(System.in);

    List<String> raflar = new ArrayList<>(Arrays.asList("raf1", "raf2", "raf3", "raf4"));

    Map<Integer, String> urunList = Storage.myMap();


    public  DepoDuzeni() {
        System.out.println("urun ekleme sayfasina geldiniz");
        System.out.println("eklemek istediginiz urunun id gir");
        String id = scan.next();
        scan.nextLine();//dummy
        System.out.println("urunun ismini giriniz");
        String urunIsmi = scan.nextLine();
        System.out.println("urun markasi gir");
        String marka = scan.nextLine();
        System.out.println("miktar gir int");
        int miktar = scan.nextInt();
        birim+=miktar;
        System.out.println("koymak istediginiz rafi giri");
        String raf = scan.next();
        DepoBilgileri obj=new DepoBilgileri(id,urunIsmi,marka,miktar,raf);





    }

}
