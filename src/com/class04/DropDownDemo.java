package com.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
import com.utils.Constants;

public class DropDownDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("Chrome", Constants.SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Input Forms")).click();

		Thread.sleep(1000);

		driver.findElement(By.linkText("Select Dropdown List")).click();

		WebElement weekDropDown = driver.findElement(By.id("select-demo"));

		// we can use select class only if the dd tag starts with select tag

		Select select = new Select(weekDropDown);

		/*
		 * 
		 * we can select values from a dd in 3 ways 1.by index 2.by visible text 3.by
		 * value attribute and you have to pass the values
		 */

		// select by index

		select.selectByIndex(4);
		Thread.sleep(4000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(4000);
		select.selectByValue("Friday");

		List<WebElement> options = select.getOptions();
		
		System.out.println(options.size());
		
		//select.deselectByIndex(4); //with single select dd you cannot deselect a value.
		
		System.out.println("is this dd multi select ="+select.isMultiple());
		
		System.out.println("_______________________________________________");
		
		WebElement multiDD=driver.findElement(By.id("multi-select"));
		
		Select select1=new Select(multiDD);
		
		select1.selectByIndex(2);
		select1.selectByIndex(3);
		select1.selectByIndex(4);
		Thread.sleep(4000);
		select1.deselectByIndex(3);

//		Iterator<WebElement> it = options.iterator();
//
//		while (it.hasNext()) {
//
//			String optionsD = it.next().toString();
//
//			System.out.println(optionsD);
//
//		}

	}

}
