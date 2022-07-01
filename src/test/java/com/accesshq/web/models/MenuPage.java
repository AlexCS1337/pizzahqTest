package com.accesshq.web.models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Predicate;


public class MenuPage {
    private final WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

//    public Pizza getVeganPizza(Predicate<Pizza> testLogic) {
//        for (WebElement planetElement : driver.findElements(By.partialLinkText("Veg"))) {
//            var veganPizza = new Pizza(pizzaElement);
//            if (testLogic.test(veganPizza)) {
//                return veganPizza;
//            }
//        }
//        throw new NotFoundException("Could not find pizza");
//    }
}
