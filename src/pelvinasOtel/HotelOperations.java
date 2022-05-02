package pelvinasOtel;

import storage_project.TryCatch;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;

import static pelvinasOtel.HotelRoomsObjectClass.*;

public class HotelOperations extends HotelServices2 {

    static Scanner scan = new Scanner(System.in);
    static long toplamGun;//alacagin localdatetime ile hesapala
    static HotelRooms obj = new HotelRooms();
    static List<Integer> sifreler = new ArrayList<>(Arrays.asList(0000, 1234, 9876, 6789, 5555));

    static double toplamGirisUcreti;//reception seciminde toplam tutar
    static double toplamCikisUcreti;//extra klairken aldigi hizmet yani =alinan hizmet +toplamGirisUcret

    static List<String> ucretHizmet = new ArrayList<>(Arrays.asList("ucretsiz ", "ucretsiz", "ucretsiz ", "ucretsiz",
            "ucretsiz ", "ucretli 100tl", "ucretli Yusuf bey ile gorusun ", "ucretli 500tl", "ucretsiz ", "ucretli 500tl", "ucretli 1000tl ", "ucretli Mirac&Mustafa beylere danisin"));
    static List<String> otelHizmetleri = new ArrayList<>(Arrays.asList("houseKeeping icin        0 ",
            "degerliEsyaSaklamaKasası icin 1 ",
            "yüzmeHavuzları icin     2 ",
            "sauna icin              3",
            "fitnessMerkezi icin     4",
            "kuaför icin             5",
            "araçKiralamaHizmetleri icin 6",
            "kuruTemizlemeUtuhizmeti icin 7",
            "ucretsizOtopark icin    8",
            "aquaPark icin           9",
            "spa icin                10",
            "turGezi icin            11"));

    public static void yazdirStr(String a) {//yazdirma action  yapan seed(tohum) create edildi
        // System.out.print(a + " ");
        System.out.println("otel hzimetlerimiz asagidadir");
        System.out.println("******************************");
        /*System.out.printf(" %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S\n %-10S" +
                        "", otelHizmetleri.get(0), otelHizmetleri.get(1), otelHizmetleri.get(2), otelHizmetleri.get(3),
                otelHizmetleri.get(4), otelHizmetleri.get(5), otelHizmetleri.get(6), otelHizmetleri.get(7),
                otelHizmetleri.get(8), otelHizmetleri.get(9), otelHizmetleri.get(10), otelHizmetleri.get(11));
   */
        for (int i = 0; i < otelHizmetleri.size(); i++) {
            System.out.printf("%-40s %-5s\n", otelHizmetleri.get(i), ucretHizmet.get(i));
        }

    }

    public static void otelHizmetleriLambda(List<String> service) {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz
        // extraHotelHizmetTalep();

    }

    public void hotelReception() {
        System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
        System.out.println("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad = TryCatchYusufBey.stringGirisi();//degiscek
        System.out.println("Lutfen tc'nizi giriniz: ");
        int tc = TryCatchYusufBey.intGirisi();
        System.out.println("Lutfen telefon numaranizi giriniz: ");
        Integer tlf = TryCatchYusufBey.intGirisi();
        //yas alip cocuklar icin indirim yap
        System.out.println("Lutfen giris yaptiginiz tarihi giriniz: (Ornek: 12-01-2022 12:00:00)");// ay ve gunu ayirmak mi yoksa string almak mi?
        String girisGunu = scan.nextLine();
        System.out.println("Lutfen cikis yapcaaan tarihi giriniz: (Ornek: 12-04-2022 12:00:00)");
        String cikisGunu = scan.nextLine();
        System.out.println("************************************");

        try {
            SimpleDateFormat simpleDateFormat
                    = new SimpleDateFormat(
                    "dd-MM-yyyy HH:mm:ss");

            Date d1 = simpleDateFormat.parse(girisGunu);
            Date d2 = simpleDateFormat.parse(cikisGunu);

            long zaman_farki = d2.getTime() - d1.getTime();
            long gun_farki = (zaman_farki / (1000 * 60 * 60 * 24)) % 365;//gune cevirdi
            long saat_farki = (zaman_farki / (1000 * 60 * 60)) % 24;//saate cevirdi

            toplamGun = gun_farki;//+saat_farki;

            if (toplamGun > 0) {
                System.out.println("Odenecek toplam gun ve saat: " + gun_farki + " gun " + saat_farki + " saat");
                System.out.println("************************************");
                //burdan sonra rooms() calisiyor
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Alıs teslimden sonra olamaz");
            hotelReception();
        }
    }

    public static void extraHotelHizmetTalep(List<String> service) throws InterruptedException {//lambda show
        System.out.println("***** Listeden diledigin hizmeti sec *****");
        service.stream().
                map(t -> t.toUpperCase(Locale.CHINA)).
                forEach(HotelOperations::yazdirStr);//soutc yaz

        int secim = TryCatch.intGirisi();
        switch (secim) {
            case 0:
                toplamGirisUcreti += odenecek_Ucret1;
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami =" + toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                otelAktiviteleri();
                CikisIslemleriFatura();
                break;
            case 1:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami =" + toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 2:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami =" + toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 3:
                System.out.println("sectiginiz hizmet tanimlandi bu hizmet muesesemizin ikrami =" + toplamGirisUcreti);
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 4:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 5:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 6:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 7:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 8:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 9:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 10:
                odemeIslemleri();//sonra odaya ciksin
                break;
            case 11:
                odemeIslemleri();//sonra odaya ciksin
                break;
            default:
                System.out.println("secmiy misen bi daha bak");
                extraHotelHizmetTalep((extraHotelHizmetTalebi));

        }

    }



    public static void otelAktiviteleri() {
        System.out.println("bunlardan hangi aktivitelere katilmak istersiniz");

        System.out.printf("%-35s %-10s \n", "Aktiviteler " ," Fiyat Bilgisi");
        System.out.println("==========================================================");
        for (int i = 0; i < otelHizmetleri.size(); i++) {
            System.out.printf("%-40s %-5s\n", otelHizmetleri.get(i), ucretHizmet.get(i));
        }
        int aktiviteSec=scan.nextInt();
        switch(aktiviteSec){
            case 0:
                toplamCikisUcreti+=0;
                break;
            case 1:
                toplamCikisUcreti+=0;
                break;
            case 2:
                toplamCikisUcreti+=0;
                break;
            case 3:
                toplamCikisUcreti+=0;
                break;
            case 4:
                toplamCikisUcreti+=0;
                break;
            case 5:
                toplamCikisUcreti+=100;
                System.out.println(toplamCikisUcreti);
                break;
            case 6:
                toplamCikisUcreti+=0;
                break;
            case 7:
                toplamCikisUcreti+=0;
                break;
            case 8:
                toplamCikisUcreti+=0;
                break;
            case 9:
                toplamCikisUcreti+=0;
                break;
            case 10:
                toplamCikisUcreti+=0;
                break;
            case 11:
                toplamCikisUcreti+=0;
                break;
            default:
                System.out.println("bari free leri seceydin");
                otelAktiviteleri();
        }


    }

    public static void odemeIslemleri() {
        System.out.println("kart ile odeme 1 nakit odeme 2");
       // int secim = JOptionPane.showOptionDialog(null, "devam etmek istiymisen", "Siparis", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, null, "secenekler");
        int odemeTuru = scan.nextInt();
        if (odemeTuru == 1) {
            boolean flag = true;
            do {
                System.out.println("kart no son dort hane  giriniz ");
                try {
                    String kartNo = scan.next();
                    if (kartNo.length() == 4) {
                        System.out.println("sifre gir");
                        flag=false;
                        try {
                            int sifre = scan.nextInt();

                            if ((sifreler.stream().anyMatch(t -> t.equals(sifre)))) {//sifreyi bankadan cek static sifreler tanimla list te ordan cek lambda match ile
                                System.out.println("sifre kabul edildi odeme tamam odaniza gidebilrsiniz");
                               // otelAktiviteleri();

                            } else throw new InputMismatchException("yanlis sifre");

                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    } else throw new InputMismatchException("son dort hane gircen");
                    flag = true;
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());

                }

            }  while (flag);

        }else if(odemeTuru==2){
            System.out.println("nakit odeme icin tesekkurler odaniza cikabilirisni");
           // otelAktiviteleri();
        }else odemeIslemleri();
    }
    public static void CikisIslemleriFatura() throws InterruptedException {
        System.out.println("faturaniz hazirlaniyor");
        Thread.sleep(3000);
        System.out.println("*");
        Thread.sleep(3000);
        System.out.println("**");
        Thread.sleep(3000);
        System.out.println("***");
        HotelServices ucretHizmet=new HotelServices();
        //tum alinan hizmetleri yazdir


    }
}
