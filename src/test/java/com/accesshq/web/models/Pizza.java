package com.accesshq.web.models;

import org.openqa.selenium.WebElement;

public class Pizza {
    private final WebElement pizzaElement;

    public Pizza(WebElement pizzaElement) {
        this.pizzaElement = pizzaElement;
    }
    public static String getPrice() {
        return "$14.99";
    }
}
