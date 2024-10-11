package IteratorPattern;

import lombok.Data;

@Data
public class MenuItem {
    private String name;
    private String description;
    private boolean  vegetable;
    private Float  price;

    public MenuItem(String name, String description,boolean  vegetable,Float  price) {
        this.name = name;
        this.description = description;
        this.vegetable = vegetable;
        this.price = price;
    }
}
