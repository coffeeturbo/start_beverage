package ru.viach.startbeverage.model;


import androidx.annotation.NonNull;

import ru.viach.startbeverage.R;

public class Beverage {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Beverage[] beverages = {
        new Beverage("Latte", "A couple of espresso shots with steam milk", R.drawable.latte),
        new Beverage("Cappuccino", "Esspresso, hot milk, and steam milk form", R.drawable.cappuccino),
        new Beverage("Black coffee", "Simple arabica coffee", R.drawable.bkack),
    };

    private Beverage(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
