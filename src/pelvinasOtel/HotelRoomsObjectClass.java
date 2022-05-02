package pelvinasOtel;



import javax.swing.*;
import java.util.*;

import static pelvinasOtel.HotelOperations.*;

public class HotelRoomsObjectClass extends HotelRooms {
    static HotelRooms tekKişilikOda = new HotelRooms("tekKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "gol", "tekYatak", 250);
    static HotelRooms ciftKişilikOda = new HotelRooms("ciftKişilikOda", "fibernet", "plazma", "kuvetBanyoJakuzi", "dag", "ciftYatak", 400);
    static HotelRooms dörtKişilikOda = new HotelRooms("dörtKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 850);
    static HotelRooms suitOda = new HotelRooms("suitOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1000);
    static HotelRooms aileOdası = new HotelRooms("aileOdası", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1500);
    static HotelRooms kralDairesi = new HotelRooms("kralDairesi", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 2500);

    static List<HotelRooms> odaTalepListesi = new ArrayList<>(Arrays.asList(tekKişilikOda,ciftKişilikOda,dörtKişilikOda,suitOda,aileOdası,kralDairesi));

    static Map<Integer, String >musteriOdaBilgisi = new TreeMap<>();//otele giris yapan musteri bilgileri burda topla
    static long girisUcreti;


    static Scanner scan = new Scanner(System.in);
    static List<String > extraHotelHizmetTalebi = new ArrayList<>(Arrays.asList("houseKeeping;\n" +
            "degerliEsyaSaklamaKasası;\n" +
            "yüzmeHavuzları;\n" +
            "sauna;\n" +
            "fitnessMerkezi;\n" +
            "kuaför;"));

    public static void rooms() throws InterruptedException {

        JOptionPane obj=new JOptionPane();

        int tercih = Integer.parseInt(JOptionPane.showInputDialog(null,"\n Lutfen talep ettiginiz oda turunun numarasini gir: \n1 : tekKişilikOda" +
                "\n2 : ciftKişilikOda \n3 : dörtKişilikOda \n4 : suitOda" +
                "\n5 : aileOdası \n 6 : kralDairesi","otel rezerv menusu",1));
        switch (tercih) {
            case 1:
                getroom("tekKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "tekYatak", 250);
                girisUcreti = toplamGun * 250;
                System.out.println("Odeyeceginiz toplam ucret: " + girisUcreti);
                extraHotelHizmetTalep(Collections.singletonList("houseKeeping;\n" +
                        "degerliEsyaSaklamaKasası;\n" +
                        "yüzmeHavuzları;\n" +
                        "sauna;\n" +
                        "fitnessMerkezi;\n" +
                        "kuaför;"));
                //odaSecimSonrasiIslemler();retouan t gezi vs
                break;
            case 2:
                getroom("ciftKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "ciftYatak", 400);
                int odenecek_Ucret2 = (int) (toplamGun * 400);
                System.out.println("Odeyeceginiz toplam ucret: "+ odenecek_Ucret2);
                //odaSecimSonrasiIslemler();retouan t gezi vs
                break;
            case 3:
                getroom("dörtKişilikOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 850);

                break;
            case 4:
                getroom("suitOda", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1000);

                break;
            case 5:
                getroom("aileOdası", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 1500);

                break;
            case 6:
                getroom("kralDairesi", "internet", "lcd", "kuvetBanyoJakuzi", "manzara", "yatakOlcut", 2500);

                break;
            default:
                System.out.println("Lutfen gecerli bir arac talep numarasi giriniz");
        }

    }



    private static void getroom(String tekKişilikOda, String internet, String lcd, String kuvetBanyoJakuzi, String manzara,
                                String yatakOlcut, int i) {
            odaTalepListesi.stream().
                    filter(t -> t.getOdaTercih().equalsIgnoreCase(tekKişilikOda)&&t.getInternet().equalsIgnoreCase(internet)&&
                                    t.getLcd().equalsIgnoreCase(lcd)&&t.getKuvetBanyoJakuzi().equalsIgnoreCase(kuvetBanyoJakuzi)&&
                            t.getManzara().equalsIgnoreCase(manzara)&&t.getYatakOlcut().equalsIgnoreCase(yatakOlcut)).
                            forEach(System.out::println);

    }
}