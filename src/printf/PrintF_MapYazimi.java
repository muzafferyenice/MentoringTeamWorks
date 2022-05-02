package printf;
import maps.MapOlustur;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public class PrintF_MapYazimi {

public class C02_ListeyiDuzenliYazdirma {
    public void main(String[] args) {
        // gorevimiz sinif listesini düzenli yazdırmak
        Map<Integer, String> sinif = MapOlustur.myMap();
        sinifListYazdir(sinif);

    }

    public void sinifListYazdir(Map<Integer, String> sinif) {
        System.out.printf("%-9s %-10s %-10s %-10s\n", "Numara", " Isim", " Soyisim", " Brans");
        System.out.println("==========================================");
        Set<Integer> keySets = sinif.keySet();
        Collection<String> valueSet = sinif.values();

        for (Integer each:keySets) {
            String values = sinif.get(each);
            String[] valuesArray = values.split(",");
            int index = 0;
            while (index < valuesArray.length-1)
                System.out.printf("%-10d %-10s %-10s %-10s\n", each , valuesArray[index], valuesArray[++index], valuesArray[++index]);
        }
    }
}

}
