package com.epam.collections.inventory_processor;

import java.util.List;

public class ShowList {
    public static void showList(List<Product> list, String a){
        System.out.println(a);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
