package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class TemperatureFunctionality extends WebMathBase{

	public void TemperatureCalculation() {
		driver.findElement(By.xpath(prop.getProperty("TemperatureOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("TemperatureValue"))).sendKeys(prop.getProperty("Temperature"));
		driver.findElement(By.xpath(prop.getProperty("UnitOfTemp"))).click();
		driver.findElement(By.xpath(prop.getProperty("K"))).click();
		driver.findElement(By.xpath(prop.getProperty("ConvertTemp"))).click();
	}
}



