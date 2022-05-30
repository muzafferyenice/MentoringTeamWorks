package pelvinasOtel;


import static pelvinasOtel.HotelRoomsObjectClass.musteriOdaBilgisi;

public class Runner extends HotelOperations {
    static HotelOperations veriGirisi1 = new HotelOperations();
    static HotelRoomsObjectClass veriGirisi = new HotelRoomsObjectClass();


    public static void main(String[] args) throws InterruptedException {
        menu();
    }

    public static void menu() throws InterruptedException {
        System.out.println("hosgeldiniz yapmak istediginiz islem nedir\n" +
                "1- Reception islemleri\n" +
                "2- oda secim\n" +
                "3- extra otel hizmetler\n" +
                "4- otel aktiviteleri\n" +
                "5- odeme islemleri\n" +
                "6- cikis islemler fatura\n" +
                "0- cikis");

        int sec = scan.nextInt();
        switch (sec) {
            case 1:
                veriGirisi1.hotelReception();
                menu();
                break;
            case 2:
                veriGirisi.rooms();
                System.out.println("dolu odalar = "+musteriOdaBilgisi);
                menu();
                break;
            case 3:
                veriGirisi1.extraHotelHizmetTalep();
                menu();
                break;
            case 4:
                veriGirisi1.otelHizmetleri();
                menu();
                break;
            case 5:
                veriGirisi1.odemeIslemleri();
                menu();
                break;
            case 6:
                veriGirisi1.CikisIslemleriFatura();
                menu();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("senins yabacaaan isin");
                menu();
        }
    }

    private static void cikis() {
        System.out.println("gule gule");
    }
}
