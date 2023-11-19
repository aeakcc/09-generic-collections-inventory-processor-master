package com.epam.collections.inventory_processor;

import java.util.*;

public class InventoryProcessor {
    public static List<Product> sort(List<Product> products) {
        NameFilter nameFilter = new NameFilter();
        Collections.sort(products, nameFilter);
        return products;
    }

    public static List<Product> distinct(List<Product> products) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for(int i = 0; i < products.size(); i++){
            hashMap.putIfAbsent(products.get(i).getCode(), products.get(i).getTitle());
        }
        List<Product> distinctList = new ArrayList<>();
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            distinctList.add(new Product(entry.getKey(), entry.getValue()));
        }
        return distinctList;
    }
}
