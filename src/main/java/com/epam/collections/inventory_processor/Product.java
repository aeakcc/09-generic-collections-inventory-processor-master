package com.epam.collections.inventory_processor;

/**
 * Class that stores data about product
 */
public class Product {
    int code;
    String title;

    public Product(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "code=" + code +
                ", title='" + title;
    }
}
