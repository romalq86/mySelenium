package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		final String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			
			System.out.println("The expected and actual titles are the same");
		}else {
			
			System.out.println("the expected and actual titles are not the same");
		}
		
		
		String expectedURL="https://www.google.com/?gws_rd=ssl";
		
		String actualURL=driver.getCurrentUrl();
		
		

		if(expectedURL.equals(actualURL)) {
			System.out.println("Both URL matched");
		}else {
			System.err.println("Actual and Expected did not match");
		}
		
		
		driver.close();
	}

}
