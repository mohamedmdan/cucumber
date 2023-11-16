package com.Stepdefiniction;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Reusable.Reusableclass;
import com.page.Pageclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a;

public class Stepdefinicationclass extends Reusableclass {
	

	 public Pageclass p;


	 @Given("the user shouuld have to lanch the mansa application")
	 public void the_user_shouuld_have_to_lanch_the_mansa_application() throws IOException, InterruptedException {
	     browserlauncher();
	      p =new Pageclass(driver);
	 }

	 @When("the user should click the our bank option")
	 public void the_user_should_click_the_our_bank_option() {
	     clicks(p.getA());
	 }

	 @Then("it should display the our bank options")
	 public void it_should_display_the_our_bank_options() {
	 }

	 @When("the user should click the about us options")
	 public void the_user_should_click_the_about_us_options() {
		 clicks(p.getB());
	 
	 }

	 @Then("it should display show the about us page")
	 public void it_should_display_show_the_about_us_page() {
	    
	 }

	 @When("user should check the scroll down funcionality")
	 public void user_should_check_the_scroll_down_funcionality() {
		 scrolldown(p.getC());
	     	 }

	 @Then("it should be scroll down the page")
	 public void it_should_be_scroll_down_the_page() {
	     
	 }


}
