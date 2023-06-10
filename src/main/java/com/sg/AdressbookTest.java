package com.sg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdressbookTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		ChromeOptions co = new ChromeOptions();
		
		
		co.addArguments("start-maximized"); // open Browser in maximized mode
		co.addArguments("disable-infobars"); // disabling infobars
		co.addArguments("--disable-extensions"); // disabling extensions
		co.addArguments("--disable-gpu"); // applicable to windows os only
		co.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		co.addArguments("--no-sandbox"); // Bypass OS security model
		co.addArguments("--headless");
        WebDriver wd = new ChromeDriver(co);
		wd.get("http://52.53.225.73:8081/addressbooksc/");
		//wd.get("https://www.flipkart.com/");
		System.out.println("Test Execution Started");
		wd.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//For Finding the button New COntact
		wd.findElement(By.className("v-button")).click();
		
		//Enter The First name
		wd.findElement(By.id("gwt-uid-5")).sendKeys("Niladri");
		
		//Enter the Last Name
		wd.findElement(By.id("gwt-uid-7")).sendKeys("Mondal");
		
		//Phone Number
		wd.findElement(By.id("gwt-uid-9")).sendKeys("999999999");
		
		//Email
		wd.findElement(By.id("gwt-uid-11")).sendKeys("nilari@gmail.com");
		
		//DOB
		wd.findElement(By.id("gwt-uid-13")).sendKeys("6/10/23,");
		
	    Thread.sleep(3000);
	    
	    wd.findElement(By.className("v-button-primary")).click();
	    
	    Thread.sleep(2000);
	    
	    System.out.println("Test Execution is successfull");
		wd.quit();

	}

}
