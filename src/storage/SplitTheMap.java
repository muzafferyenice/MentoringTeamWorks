package storage;

import java.util.*;

import static storage.Storage.storageMap;

public class SplitTheMap {
    public static void splitTheMap() {

        Map<Integer, String> map = Storage.myMap();
        Set<Integer> strogeKeySet = storageMap.keySet();
        System.out.println(strogeKeySet);
        Collection<String> storageValueSet = storageMap.values();
        System.out.println(storageValueSet);
        List<Integer> keySetList = new ArrayList<>();
        keySetList.addAll(strogeKeySet);
        List<String> valueSetList = new ArrayList<>();
        valueSetList.addAll(storageValueSet);

        int outerArraySize = valueSetList.size();
        String firstValue=valueSetList.get(0);
        String firstValueArr[]=firstValue.split(", ");
        int innerArrSize=firstValueArr.length;

        String  storageMDArray[][]=new String[outerArraySize][innerArrSize];

        for (int i = 0; i < outerArraySize; i++) {
            String temp[]=valueSetList.get(i).split(", ");
            for (int j = 0; j < innerArrSize; j++) {



            }
        }

    }
}
