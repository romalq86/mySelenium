package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandDemo2 {
	
	
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static final String USERNAME="admin";
	public static final String PASS="Hum@nhrm123";

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input [@id='txtPassword']")).sendKeys(PASS);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("Size of all links"+links);
		
		for(WebElement El: links) {
			 
			String allLinks=El.getText();
			
			
			if (!allLinks.isEmpty()) {
				
				System.out.println(allLinks);
			}
		}
		
	
		
	}

}
