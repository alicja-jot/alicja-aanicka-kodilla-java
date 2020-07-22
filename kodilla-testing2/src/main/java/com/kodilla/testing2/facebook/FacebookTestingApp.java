package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String SEARCHFIELD = "_nkw";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//select[@id=\"day\"]")).sendKeys("5");
        driver.findElement(By.xpath("//select[@id=\"month\"]")).sendKeys("lut");
        driver.findElement(By.xpath("//select[@id=\"year\"]")).sendKeys("1993");
    }
}
