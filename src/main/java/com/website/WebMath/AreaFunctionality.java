package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class AreaFunctionality extends WebMathBase{

	public void AreaCalculation() {
		driver.findElement(By.xpath(prop.getProperty("AreaOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("AreaValue"))).sendKeys(prop.getProperty("Area"));
		driver.findElement(By.xpath(prop.getProperty("UnitOfArea"))).click();
		driver.findElement(By.xpath(prop.getProperty("Squareinch"))).click();
		driver.findElement(By.xpath(prop.getProperty("ConvertArea"))).click();
	}

}


