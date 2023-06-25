package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class MassFunctionality extends WebMathBase {

	public void MassCalculation() {
		driver.findElement(By.xpath(prop.getProperty("MassOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("MassValue"))).sendKeys(prop.getProperty("Mass"));
		driver.findElement(By.xpath(prop.getProperty("UnitOfMass"))).click();
		driver.findElement(By.xpath(prop.getProperty("Kilogram"))).click();
		driver.findElement(By.xpath(prop.getProperty("ConvertMass"))).click();
	}
}



