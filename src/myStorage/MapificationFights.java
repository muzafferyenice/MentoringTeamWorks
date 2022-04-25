package myStorage;

import storage.Storage;

import javax.swing.*;
import java.util.*;


public class MapificationFights {
    public static void fights() {


        Map<Integer, String> storageProducts = Storage.myMap();
        System.out.println(storageProducts);
        String secenek[] = {"evet", "hayir"};
        String mesaj = "ne yapcan";
        JOptionPane.showMessageDialog(null, "burda kod savaslari var");
        int sec = JOptionPane.showOptionDialog(null, mesaj, "burda kod savaslari var", JOptionPane.YES_NO_CANCEL_OPTION, 2, null, secenek, null);

        //map i set sonra list yap ki indexleme yapabil
        Set<Integer> storageProductsKeySet = storageProducts.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(storageProductsKeySet);
        JOptionPane.showMessageDialog(null, keyList);
        //ayni islemleri value lari indexlemek icin yap
        Collection<String> storageProductsValue = storageProducts.values();
        List<String> valueList = new ArrayList<>();
        valueList.addAll(storageProductsValue);
        JOptionPane.showMessageDialog(null, valueList);

        //inner ve outer boyutlari bulur MD arraya ata

        int outerArrayBoyut = valueList.size();
        String ilkValue = valueList.get(0);
        JOptionPane.showMessageDialog(null, ilkValue);
        String ilkValueArr[] = ilkValue.split(", ");

        int innerArrBoyut = ilkValueArr.length;
        String valueMDArr[][] = new String[outerArrayBoyut][innerArrBoyut];
        for (int i = 0; i < outerArrayBoyut; i++) {
            String temporary[] = valueList.get(i).split(", ");
            JOptionPane.showMessageDialog(null, temporary[i]);
            for (int j = 0; j < innerArrBoyut; j++) {
                valueMDArr[i][j] = temporary[j];
                JOptionPane.showMessageDialog(null, valueMDArr[i][j]);
            }
        }
        //JOptionPane.showMessageDialog(null,Arrays.deepToString(valueMDArr));
        System.out.println("id  marka   tur  miktar");
        System.out.println("=============================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j < innerArrBoyut; j++) {
                System.out.print(valueMDArr[i][j] + "   ");
            }
            System.out.println("");


        }
        System.out.printf("%4d %-6s %-9s %-6s %s\n", valueMDArr[0]);
    }

}