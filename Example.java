package com.config.properties;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.config.properties.test;

public class Example {
	@Test
 public static void test() throws IOException {
 test t=new test();
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\lib\\chromedriver.exe");

   WebDriver driver = new ChromeDriver();
   driver.get("http://www.orangehrm.com");
   WebElement contactElement     = driver.findElement(By.cssSelector("#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "));
   contactElement.click();
   WebElement firstElement     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.firstname")));
   
   WebElement lastElement     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.lastname")));
   WebElement companyElement     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.companyname")));
   WebElement employeeElement     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.numemployees")));
   WebElement JobTitle     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.jobtitle")));
   WebElement phoneElement     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.phone")));
   WebElement email     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.email")));
   WebElement Country     = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.country")));
   firstElement.sendKeys("Sakthi");
   lastElement.sendKeys("Nandhini");
   companyElement.sendKeys("ATMECS");
   employeeElement.sendKeys("17");
   JobTitle.sendKeys("Software-Trainee");
   phoneElement.sendKeys("9698123843");
   email.sendKeys("sakthinandhinis17@gmail.com");
   Country.sendKeys("India");
   

 }
}