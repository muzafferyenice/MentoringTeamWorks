package printf;

import pelvinasOtel.HotelOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Printf {
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
    public static void main(String[] args) {

        int sayi = 123;
        String str = "Ahmet Bulutluoz";
        Double dob = 1.21454846;
        System.out.printf("sayi : %-10d , str:%20.10S, dou : %f", sayi, str, dob);//- ler sola yaslar f yazarsan double calisiri
        otelHizmetleriLambda(otelHizmetleri);
    }
        public static void yazdirStr(String a) {//yazdirma action  yapan seed(tohum) create edildi
            System.out.println("otel hzimetlerimiz asagidadir");
            System.out.println("******************************");
            for (int i = 0; i < otelHizmetleri.size(); i++) {
                System.out.printf("%-40s %-5s\n", otelHizmetleri.get(i), ucretHizmet.get(i));
            }
        }
        public static void otelHizmetleriLambda(List<String> service) {
            System.out.println("*****rezervasyon tamam PELVINAS otele hosgeldin*****");
            service.stream().
                    map(t -> t.toUpperCase(Locale.CHINA)).
                    forEach(HotelOperations::yazdirStr);//soutc yaz


        }


}
