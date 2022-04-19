package okul_Proje;

import static okul_Proje.Bilgi_Class.*;

public class EklemedirKocakonak extends Bilgi_Class{

    public  void ekleme() {//try catch calis{
        System.out.println("****** " + kisi + " ekleme sayfasina hosgelmissen" + "*********");
        scan.nextLine();//dummy
        System.out.println("isim gir");
        String adSoyad = scan.nextLine();
        System.out.println("kimlik no giriniz ");
        String kimlikNo = "";
        try {//1
            kimlikNo = scan.nextLine();
            kimlikNo = kimlikNo.replace(" ", "");//bosluklu girerse diye
            if (kimlikNo.length() != 5) {//2
                throw new StringIndexOutOfBoundsException("Hatali veya eksik tuslama yaptiniz");
            } else {//2
                if (kisi.equalsIgnoreCase("Ogrenci")) {//3
                    System.out.println("yas gir");
                    int yas = 0;
                    try {//4
                        yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 8 || yas > 19) {//5
                            throw new ArithmeticException("Bu yaslarda ogrenci olmaz");
                        } else {//5
                            System.out.println("ogrenci no gir");
                            int ogrenciNo = scan.nextInt();
                            scan.nextLine();//dummy
                            System.out.println("ogrenci sinif girin");
                            String sinif = scan.nextLine();
                            Ogrenci obj = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                            ogrenci.add(obj);
                            System.out.println("eklenen ogrenci : "+ obj.getAdSoyad());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {//3
                    System.out.println("yas giriniz");
                    int yas = 0;
                    try {//4
                        yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 23 || yas > 65) {//5
                            throw new ArithmeticException("Bu yaslarda ogretmenlik yapamazsiniz");
                        } else {//5
                            System.out.println("brans gir");
                            boolean flag = true;
                            String brans = "";
                            try {//6
                                brans = scan.nextLine();
                                for (int i = 0; i < branslar.length; i++) {
                                    if (brans.equalsIgnoreCase(branslar[i])) {//7

                                        flag = false;
                                    }
                                }
                                if (flag) {//true olmasi durumu
                                    throw new ArrayStoreException("Boyle bir brans yoktur");
                                }else{
                                    System.out.println("sicil no gir (ornek : \"a12345\"  seklindeolmali ");
                                    String sicilNo = "";
                                    try {
                                        sicilNo = scan.nextLine();
                                        sicilNo=sicilNo.replace(" ","");//bosluk girme durumu
                                        String sicilKontrol=sicilNo;
                                        sicilKontrol=sicilKontrol.replaceAll("\\d","");//rakamlar silindi
                                        if(sicilKontrol.length()==1&&sicilNo.length()==6){// tek harf varsa ve harften sonra 5 rakam varsa
                                            Ogretmen obj2 = new Ogretmen(adSoyad, kimlikNo, yas, brans, sicilNo);
                                            ogretmen.add(obj2);
                                            System.out.println("eklenen ogretmen : "+obj2.getAdSoyad());
                                        }else{
                                            throw new Exception("Dikkat sicil no harf ile baslamali ve rakamla devam etmeli ve harften sonra sadece 5 rakam olmali");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        altMenu();// bu sapka cikartir
    }
}

