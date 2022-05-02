package pelvinasOtel;

import java.util.*;

public class HotelMapsNestedMap {
    static Map<Integer, String> rooms = new HashMap<>();

    static Map<String, Map<Integer, String>> kacYildizlHotel = new HashMap<>();

    public static void hotelMap() {//burda ortalik karisti map map eklemek icin ij onerileri yaptim
        rooms.put(100, "ortaLux, tekKisi, ikiOda, jakuzi, tekKisilik");
        rooms.put(101, "lux, ikiKisi, ikiOda, jakuzi, ciftKisilik");
        rooms.put(102, "ultraLux, dortKisi, ucOda, jakuzi, ultraBoy");

        kacYildizlHotel.put("birYildiz", rooms);
        kacYildizlHotel.put("ucYildiz", rooms);
        kacYildizlHotel.put("besYildiz", rooms);




        Set<Map.Entry<Integer, String>> roomsEntrySet = rooms.entrySet();
        System.out.println("          odaNo  lux  kisiKapasite odaSayi  jakuzi  yatakBoyut ");
        int count=0;
        for (Map.Entry<Integer, String> each : roomsEntrySet
        ) {
            Integer entryKey = each.getKey();
            String valueStr = each.getValue();
            System.out.println("***************************************************");
            String valueArr[] = valueStr.split(", ");

                Set<String> key = kacYildizlHotel.keySet();
                List<String> keyList = new ArrayList<>();
                keyList.addAll(key);

                System.out.printf("%-10s %-4d %-10s %-10s %-6s %-10s %-5s\n", keyList.get(count), entryKey, valueArr[0],
                        valueArr[1], valueArr[2], valueArr[3], valueArr[4]);
            count++;
            }


        }
    }





















