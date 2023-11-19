package com.epam.collections.inventory_processor;

import java.util.List;

public class Start {
    public static void start(){
        FileReader originalList = new FileReader();
        originalList.readFile();

        List<Product> list = ImportList.importList(originalList);
        ShowList.showList(list, "Original list: ");

        InventoryProcessor.sort(list);
        ShowList.showList(list, "Sorted list: ");

        InventoryProcessor.distinct(list);
        ShowList.showList(list, "Distinct list: ");
    }
}
