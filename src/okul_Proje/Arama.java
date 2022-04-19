package okul_Proje;



public class Arama extends EklemedirKocakonak  {

    public  void arama() {
        System.out.println("****** " + kisi + " arama sayfasina hosgelmissen" + "*******");
        System.out.println("aramak istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();
        tc = tc.replaceAll(" ", "");
        if (kisi.equalsIgnoreCase("ogrenci")) {
            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogrenci) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogrenciyi geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        } else {

            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogretmen) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogretmeni geitirir
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        }
    }
}
