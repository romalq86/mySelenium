package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	
	public static String path="http://google.com";
	
	
	public static void main(String[] args) throws InterruptedException {

		
		String path="";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		
		
		driver.get(LunchChromeBrowser.path);
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
