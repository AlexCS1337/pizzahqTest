package com.accesshq.web.tests;

import com.accesshq.web.models.ContactPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaHQTestSuite {

    private WebDriver driver;

    @BeforeEach
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(("https://d2tjwct0w5ff76.cloudfront.net/"));
    }

    @Test
    public void Verify_Contact_Error () {
        // Arrange
        driver.findElement(By.cssSelector("[aria-label=contact")).click();

        // Act
        driver.findElement(By.id("email")).sendKeys("xxx");
        driver.findElement(By.id("telephone")).sendKeys("xxx");
        var contactPage = new ContactPage(driver);
        contactPage.clickSubmit();

        // Assert
        Assertions.assertEquals("Email is invalid", contactPage.getEmailErrorText(),"Validating to see if email error is correct");
        Assertions.assertEquals("Telephone is invalid", contactPage.getTelephoneErrorText(), "Validating to see if telephone error is correct");

        // Act
        contactPage.clickClear();

        //Assert
        Assertions.assertEquals("", contactPage.getEmailErrorText(), "Validating to see if error message is gone");
        Assertions.assertEquals("", contactPage.getTelephoneErrorText(), "Validating to see if error message is gone");
    }

    @AfterEach
    public void tearDown () {
        driver.quit();
    }
}
