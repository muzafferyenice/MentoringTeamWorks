package myProjects_Basic;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDate3 {
    public static void main(String[] args) {
        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33); //zaman cetveli tanimlanmistir
        Period p = Period.ofDays(1).ofYears(2);//Period Claass dan p objemiz var
        //Period p1 = Period.ofDays(1);
        // en son hangisi eklendiyese o gecerlidir, oncekileri gecersiz kilar.
        //  sadece yil -> 2 olarak aliriz

        d = d.minus(p); // mines geriye gider, yukardan aldigi 2 yili geriye goturerek 2013 olarak atama yapar
        //d = d.minus(p1);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); //sn yi almadan yazdiriyor
        System.out.println(d.format(f)); //10.05.2013 11:22
 /*
            A. 5/9/13 11:22 -> yanlis !!DIKKAT!!
            B. 5/10/13 11:22 ***cevap***
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/


        // Bugunun tarihi aliniz, yazdiriniz...
        // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..
        // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        System.out.println(LocalDate.now());

        LocalDate degisenTarih = bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degisenTarih = " + degisenTarih);

        LocalDate sonTarih = degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("sonTarih = " + sonTarih);

        // Baska ülke veya bolgelerin saat dilimine gore zamani alma
        // New york un saat dilimine gore saat ?
        // zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtl = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        //String ifade onemli, hatasiz yazilmasi gerek.. yoksa Unknown time-zone ID hatasi verir

        ZonedDateTime zdtLocal = ZonedDateTime.now(); //yerelde bulundugunuz yerin zamanini verir

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm"); //istenilen formatta

        System.out.println("zdt = " + zdt.format(format));
        System.out.println("zdtLocal = " + zdtLocal.format(format));
        System.out.println("zdtl = " + zdtl.format(format));

    }
}

