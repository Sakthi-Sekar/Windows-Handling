package Selenium.com.atmecs.utilitypackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.config.properties.test;

@Test
public class Browser {
	public static void BrowserTest() throws FileNotFoundException{
		
		test t = new test();
		WebElement contactElement;
		WebElement firstElement;
		WebElement lastElement;
		WebElement companyElement;
		WebElement employeeElement;
		WebElement JobTitle;
		WebElement phoneElement;
		WebElement email;
		WebElement Country;
		WebDriver driver;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the browser");
		String browser = scan.nextLine();
		switch (browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.orangehrm.com");
			contactElement = driver.findElement(By.cssSelector(
					"#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "));
			contactElement.click();
			firstElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.firstname")));

			lastElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.lastname")));
			companyElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.companyname")));
			employeeElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.numemployees")));
			JobTitle = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.jobtitle")));
			phoneElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.phone")));
			email = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.email")));
			Country = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.country")));
			firstElement.sendKeys("Sakthi");
			lastElement.sendKeys("Nandhini");
			companyElement.sendKeys("ATMECS");
			employeeElement.sendKeys("17");
			JobTitle.sendKeys("Software-Trainee");
			phoneElement.sendKeys("9698123843");
			email.sendKeys("sakthinandhinis17@gmail.com");
			Country.sendKeys("India");

		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.orangehrm.com");
			contactElement = driver.findElement(By.cssSelector(
					"#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "));
			contactElement.click();
			firstElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.firstname")));

			lastElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.lastname")));
			companyElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.companyname")));
			employeeElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.numemployees")));
			JobTitle = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.jobtitle")));
			phoneElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.phone")));
			email = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.email")));
			Country = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.country")));
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
}