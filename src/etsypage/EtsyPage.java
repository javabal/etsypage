package etsypage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class EtsyPage {
	public static void main(String[] args) throws InterruptedException {
	
	//first change
	System.setProperty("webdriver.chrome.driver","/Users/nihaltemel/Documents/Libraries/drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	

	driver.get("https://www.google.com/");
	driver.findElement(By.id("lst-ib")).sendKeys("etsy.com");
	Thread.sleep(5000);
	driver.findElement(By.className("lsb")).click();
	driver.findElement(By.id("vs0p1c0")).click();
	Assert.assertTrue(driver.findElement(By.id("etsy-logo")).isDisplayed());
	  
	
	}


}
