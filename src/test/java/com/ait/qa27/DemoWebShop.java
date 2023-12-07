package com.ait.qa27;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShop {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void findElementByCssSelectors() {
    driver.findElement(By.cssSelector("#bar-notification"));
    driver.findElement(By.cssSelector("#dialog-notifications-success"));
    driver.findElement(By.cssSelector("#dialog-notifications-error"));
    driver.findElement(By.cssSelector(".master-wrapper-page"));
    driver.findElement(By.cssSelector(".topic-html-content"));
    driver.findElement(By.cssSelector("[title='']"));
    driver.findElement(By.cssSelector("[title='']"));
    driver.findElement(By.cssSelector("[title='']"));
    driver.findElement(By.cssSelector("[title='']"));
    driver.findElement(By.cssSelector("[title='']"));

  }

  @Test
  public void findElementByXpath() {
    driver.findElement(By.xpath("//*[@title='bar-notification']"));
    driver.findElement(By.xpath("//*[@title='dialog-notifications-success']"));
    driver.findElement(By.xpath("//*[@title='dialog-notifications-error']"));
    driver.findElement(By.xpath("//*[@title='.master-wrapper-page']"));
    driver.findElement(By.xpath("//*[@title='.topic-html-content']"));
    driver.findElement(By.xpath("//*[@title='']"));
    driver.findElement(By.xpath("//*[@title='']"));
    driver.findElement(By.xpath("//*[@title='']"));
    driver.findElement(By.xpath("//*[@title='']"));
    driver.findElement(By.xpath("//*[@title='']"));
  }

  @AfterMethod(enabled = true)
  public void tearDown() {
    driver.quit();
  }

}