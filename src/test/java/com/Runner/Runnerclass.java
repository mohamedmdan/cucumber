package com.Runner;
 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/cucumber1.feature",
glue = "com.stepdefinition",plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class Runnerclass {
 
}
