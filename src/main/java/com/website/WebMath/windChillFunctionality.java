package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class windChillFunctionality extends WebMathBase{

	public void WindChillCalculations() {
		driver.findElement(By.xpath(prop.getProperty("WindChillSection"))).click();
		driver.findElement(By.xpath(prop.getProperty("OutsideTemperatureSection"))).sendKeys(prop.getProperty("OutsideTemperature"));
		driver.findElement(By.xpath(prop.getProperty("WindSpeedSection"))).sendKeys(prop.getProperty("WindSpeed"));
		driver.findElement(By.xpath(prop.getProperty("HowDoesItFeel?Button"))).click();
	}
}
