package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class Pageclass extends Baseclass {
	Pageclass p;
	
	public Pageclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "(//span[text()='Our Bank'])[1]")
	 WebElement a;
	 @FindBy(linkText="About Us")
	 WebElement b;
	 @FindBy(xpath = "(//span[@class='button primary'])[1]")
	 WebElement c;
	 
	 public WebElement getA() {
		 return a;
	 }
	  
	 public WebElement getB() {
		 return b;
		 
	 }
	 
	 public WebElement getC() {
		 return c;
	 }

}
