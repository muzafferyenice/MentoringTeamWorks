package advancedPrejects2;

public class TcDogrulama {
    public static void main(String[] args) {
        /*
         Tc Kimlik Numarası aslında 9 haneden oluşmaktadır, son 2 hanesi de kontrol/doğrulama amaçlı eklenmiştir.
         Kimlik numarası 0 ile başlayamaz. İlk 9 rakam kullanılarak 10. hane, ilk 10 rakam kullanılarak da 11.
         hane elde edilmektedir.

1., 3., 5., 7. ve 9. hanelerdeki rakamlar toplanır, 7 ile çarpılır ve 2., 4., 6. ve 8. hanelerdeki rakamların
toplamı çıkarılır. Elde edilen sonucun birler basamağı (mod 10) kimlik numarasının 10. hanesini vermektedir.

Kimlik numarasının ilk 9 hanesi ile yukarıdaki yöntemle elde ettiğimiz 10. haneyi topladığımızda birler basamağı
(mod 10) 11. haneyi vermektedir.

Biraz daha matematiksel olarak ifade etmek gerekirse ;

Kimliğin ilk 9 rakamı için d, kontrol basamakları için c kullanırsak :

Tc No = d1 d2 d3 d4 d5 d6 d7 d8 d9 c1 c2

c1 = ( (d1 + d3 + d5 + d7 + d9) * 7 - (d2 + d4 + d6 + d8) ) mod10

c2 = ( d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + c1 ) mod10,

Söz konusu akrabaların Tc Kimlik numarasını hesaplamak olduğu zaman işler biraz daha karışıklaşabiliyor.
Aynı soyada sahip (aynı kütüğe kayıtlı) akrabaları bulmak için, kimlik numarasının anlamlı ilk 9 rakamından
29999 çıkardığımız zaman yaşca küçük akrabamızı, eklediğimiz zaman da yaşca büyük akrabamızı buluruz.
         */
        String tc= "12345678910";


    }
}
