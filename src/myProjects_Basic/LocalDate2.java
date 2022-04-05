package myProjects_Basic;
import java.time.LocalDate;
import java.time.Month;
public class LocalDate2 {

    public static void main(String[] args) {
        /*
       Which of the following can be inserted into the blank to create a date of June 21, 2014?
       21 Haziran 2014 tarihini olusturmak için bos bırakılan yere asagidakilerden hangisi veya hangileri getirilebilir?
       A. new LocalDate(2014, 5, 21); //new keywordu LocalDate de kullanilmaz
       B. new LocalDate(2014, 6, 21); //new keywordu LocalDate de kullanilmaz
       C. LocalDate.of(2014, 5, 21); //5.ay vermis  Mayis ayi..
       D. LocalDate.of(2014, 6, 21);          **cevap**
       F. LocalDate.of(2014, Month.JUNE, 21); **cevap**
         */
            LocalDate date1  = LocalDate.of(2014, Month.JUNE,21);
            System.out.println("date1 = " + date1); //date1 = 2014-06-21

            LocalDate date2  = LocalDate.of(2014, 6,21);
            System.out.println("date2 = " + date2); //date2 = 2014-06-21

  /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */
        //    LocalDate date = LocalDate.of(2018,Month.FEBRUARY, 29);
        //    System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
            /*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown. **cevap**
            */

        //Invalid date 'February 29' as '2018' is not a leap year bu yuzden exception verir
        System.out.println(LocalDate.now().isLeapYear()); //artik yil olup olmadigini belirler boolean sonuc dondurur
        //2022 -> false doner


          /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2); //2 gun artirma
        date.plusYears(3); //3 yil artirma

        System.out.println(date); //2018-04-30
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());  //2018 APRIL 30
        //sonuc degismez, cunku atama yapilmamis

/*
            A. 2018 APRIL 2
            B. 2018 APRIL 30 ***cevap***
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. A runtime exception is thrown.
 */


        }
    }


