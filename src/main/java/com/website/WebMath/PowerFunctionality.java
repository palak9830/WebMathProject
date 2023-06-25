package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class PowerFunctionality extends WebMathBase{

	public void PowerCalculation() {
		driver.findElement(By.xpath(prop.getProperty("PowerOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("PowerValue"))).sendKeys(prop.getProperty("Power"));
		driver.findElement(By.xpath(prop.getProperty("ConvertPower"))).click();
	}
}




