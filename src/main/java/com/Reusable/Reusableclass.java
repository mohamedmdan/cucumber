package com.Reusable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class Reusableclass extends Baseclass {
	
	
	
	public void senddd(WebElement m, String text) {
		m.sendKeys(text);
	}	
	       
	
     public void clicks(WebElement d) {
    	 d.click();
    	 
     
     }
     public void scrolldown(WebElement webElement) {
    	 JavascriptExecutor js = (JavascriptExecutor)webElement;
    	 js.executeScript("arguments[0].scrollintoView();", "a");


}
}
