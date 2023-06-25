package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class SpeedFunctionality extends WebMathBase{

	public void SpeedCalculation() {
		driver.findElement(By.xpath(prop.getProperty("SpeedOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("SpeedValue"))).sendKeys(prop.getProperty("Speed"));
		driver.findElement(By.xpath(prop.getProperty("ConvertSpeed"))).click();
	}
}





