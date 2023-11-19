package com.epam.collections.inventory_processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private List<String> allValuesFromFile;
    public void readFile(){
        List<String> content = new ArrayList<>();
        List<String> list = new ArrayList<>();
        try {
            content = Files.readAllLines(Paths.get(
                    "C:\\Users\\AEAKC\\IdeaProjects\\09-generic-collections-inventory-processor-master\\" +
                            "src\\main\\resources\\goods.txt"));
        } catch (IOException e) {
            System.out.println("Wrong directory of file");
        }
        for(int i = 0; i < content.size(); i++){
            String[] arr = content.get(i).split("=");
            list.add(arr[0]);
            list.add(arr[1]);
        }
        this.allValuesFromFile = list;
    }

    public List<String> getAllValuesFromFile() {
        return allValuesFromFile;
    }
}
