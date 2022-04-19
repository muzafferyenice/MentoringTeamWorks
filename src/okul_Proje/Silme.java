package okul_Proje;

public class Silme extends Arama{

    public  void silme() {
        System.out.println("****** " + kisi + " silme  sayfasina hosgelmissen" + "*******");
        System.out.println("silmek istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();// bosluk durumuna gore try catch e bagla
        tc = tc.replaceAll(" ", "");
        boolean flag = true;
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi sil : ogrenci) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    System.out.println("silinen ogrenci " + sil.getAdSoyad());
                    ogrenci.remove(sil);
                    System.out.println("silindi niye sildin ki ");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");
            }
        } else {
            for (Kisi sil : ogretmen) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    System.out.println("silinen ogretmen " + sil.getAdSoyad());
                    ogretmen.remove(sil);
                    System.out.println("silindi niye sildin ki ");

                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");

            }
        }

    }

}
