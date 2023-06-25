package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class LengthFunctionality extends WebMathBase {

	public void LengthCalculation() {
		driver.findElement(By.xpath(prop.getProperty("LengthOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("LengthValue"))).sendKeys(prop.getProperty("Length"));
		driver.findElement(By.xpath(prop.getProperty("UnitOfLength"))).click();
		driver.findElement(By.xpath(prop.getProperty("Kilometer"))).click();
		driver.findElement(By.xpath(prop.getProperty("ConvertLength"))).click();
	}
}



