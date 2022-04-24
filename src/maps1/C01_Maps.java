package maps1;

import maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // listeyi duzenli yazdir
        Map<Integer, String> sinifList = MapOlustur.myMap();
        System.out.println(sinifList);//{101=Ali, Can, Dev, 102=VAli, Can, Qa, 103=Veli, Yan, Dev}
        /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySet = sinifList.keySet();//unique  nolari aldik
        //Integer keyarr[]=new Integer[sinifList.size()];
        List<Integer> keyList = new ArrayList<>();// index le calismak icin liste atadik
        keyList.addAll(sinifKeySet);
        System.out.println(keyList);//[101, 102, 103] list olarak key ler
        System.out.println(keyList.get(1));//102

        // Simdi de value'leri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValue = sinifList.values();
        System.out.println("sinifValue = " + sinifValue);//sinifValue = [Ali, Can, Dev, VAli, Can, Qa, Veli, Yan, Dev]
        List<String> listValue = new ArrayList<>();// index le calismak icin liste atadik
        listValue.addAll(sinifValue);
        System.out.println(listValue);//[Ali, Can, Dev, VAli, Can, Qa, Veli, Yan, Dev]
        // System.out.println(listValue.get(1));

        /* her bir value birden fazla bilgiyi iceriyor
          onun icin value'leri multidimensional bir array'e atmak mantikli duruyor
          ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var
         */

        int outerArrayBoyut = listValue.size();//3
        // inner array'lerin boyutunu bulmak biraz daha kompleks olacak
        String ilkValue = listValue.get(0);
        System.out.println("ilkValue = " + ilkValue);//ilkValue = Ali, Can, Dev
        String ilkValueArr[] = ilkValue.split(", ");
        int innerArrBoyut = ilkValueArr.length;

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = listValue.get(i).split(", ");
            for (int j = 0; j < innerArrBoyut; j++) {
                valueMDArr[i][j] = temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));//[[Ali, Can, Dev], [VAli, Can, Qa], [Veli, Yan, Dev]]
        // bu satira kadar key'leri index ile ulasabildigim keyList' e atadim
        // value'leri valueMDArr'e atadim
        // simdi bu key ve value'leri istedigim gibi manuple edebilirim

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j < innerArrBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");//Numara  Isim   Soyisim  Brans
                                                           // =============================
                                                           //  101   Ali   Can   Dev
                                                           //  102   VAli   Can   Qa
                                                           //  103   Veli   Yan   Dev

            }
            System.out.println("");

        }
    }
}