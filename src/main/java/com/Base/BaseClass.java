package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
   public static WebDriver driver;

    public static void main(String[] args) {
     //   chrome_launch();
     //   chrome_close();
        firefox_launch();
        open_URL();
        firefox_close();
    }
    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
    }
    public static void chrome_close(){
        driver.close();
    }
    public static void chrome_quit(){
        driver.quit();
    }
    public static void firefox_close(){
       driver.close();
    }
    public static void firefox_quit(){
        driver.quit();
    }
    public static void open_URL(){
        driver.get("https://google.com");
    }

}
