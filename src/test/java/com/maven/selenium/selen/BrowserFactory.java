package com.maven.selenium.selen;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BrowserFactory {
 

 
public BrowserFactory(){
	  
}
public static void main(String[] args) {
    System.out.println("Hello World!");
    System.setProperty("webdriver.gecko.driver", "/Users/oytun/Downloads/geckodriver");
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.addArguments("--headless");
    
    WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	System.out.println("OPENING DRIVER");
	driver.get("http://google.com/");
	System.out.println("BROWSER IS ON");
	driver.quit();

}


}