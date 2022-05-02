package pelvinasOtel;




public class Runner extends HotelOperations {

    public static void main(String[] args) throws InterruptedException {
        HotelOperations veriGirisi1 = new HotelOperations();
        veriGirisi1.hotelReception();//gun saat yazdiriyor tamm
        HotelRoomsObjectClass veriGirisi = new HotelRoomsObjectClass();
        veriGirisi.rooms();



    }
}
