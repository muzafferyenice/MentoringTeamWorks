package okul_Proje;



public class Listeleme extends Silme{
    public  void listeleme() {
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi herOgrenci : ogrenci) {
                System.out.println(herOgrenci);
            }
        } else {
            for (Kisi herOgretmen : ogretmen) {
                System.out.println(herOgretmen);
            }
        }

    }
}
