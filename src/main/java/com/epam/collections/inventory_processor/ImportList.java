package com.epam.collections.inventory_processor;

import java.util.ArrayList;
import java.util.List;

public class ImportList {
    public static List<Product> importList(FileReader originalList){
        List<Product> list = new ArrayList<>();
        for(int i = 0; i < originalList.getAllValuesFromFile().size(); i += 2){
            list.add(new Product(Integer.parseInt(originalList.getAllValuesFromFile().get(i)),
                    originalList.getAllValuesFromFile().get(i + 1)));
        }
        return list;
    }
}
