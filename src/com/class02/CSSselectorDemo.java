package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("sohilaryan");
		

		
		Thread.sleep(4000);
		
		driver.close();
		// css=   input[name='txtUsername']
		
		//  input#txtUsername  only if you have id attribute
		
		// input.button  dot (.) use for class. if there is space in class value, then replace it with (.)
		
		// input[name^='txt']  starts with CSS Selector
		
		// input[name$='name']  $ represents ends with
		
		// input[id*='nL']   * keyword represents contains
		
		//  
		
	}

}
