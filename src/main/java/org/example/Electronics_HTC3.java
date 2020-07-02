package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Electronics_HTC3
{
    static WebDriver driver;

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver", "c:\\soft\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com//");
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.linkText("Cell phones")).click();
        driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).click();
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-18\"]")).click();
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.linkText("Notebooks")).click();
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-4\"]")).click();
        driver.findElement(By.linkText("Shopping cart")).click();
        String pageText=driver.findElement(By.linkText("HTC One M8 Android L 5.0 Lollipop")).getText();
        System.out.println(pageText);
        String pageText1=driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).getText();
        System.out.println(pageText1);
    }
}
