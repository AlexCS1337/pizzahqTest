package com.accesshq.web.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactPage {

    private final WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailErrorText() {
        List<WebElement> elemList = driver.findElements(By.id("email-err"));
        return elemList.size() > 0 ? elemList.get(0).getText() : "";
    }

    public void clickSubmit() {
        driver.findElement(By.cssSelector("[aria-label=submit]")).click();
    }

    public String getTelephoneErrorText() {
        List<WebElement> elemList = driver.findElements(By.id("telephone-err"));
        return elemList.size() > 0 ? elemList.get(0).getText() : "";
    }

    public void clickClear() {
        driver.findElement(By.cssSelector("[aria-label=clear")).click();
    }
}
