package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	   
	public WebDriver driver;
	public Properties p;
	 
       public void browserlauncher() throws IOException, InterruptedException {
    	   FileInputStream f=new FileInputStream("src/test/resources/properties/cucumber2.properties");
    	   Properties p=new Properties();
    	   p.load(f);
    	   p.getProperty("Browser").equalsIgnoreCase("chrome");
     	  WebDriverManager.chromedriver().setup();
     	  driver=new ChromeDriver();
     	  driver.manage().window().maximize();
     	  driver.get(p.getProperty("URL"));
     	  Thread.sleep(5000);
     	  
       }
	 

       
}
