package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class costOfElectricityFunctionality extends WebMathBase{

	public void CostOfElectricity() {
		driver.findElement(By.xpath(prop.getProperty("CostOfElectricity"))).click();
		driver.findElement(By.xpath(prop.getProperty("DeviceValueOption"))).sendKeys(prop.getProperty("DeviceValue"));
		driver.findElement(By.xpath(prop.getProperty("DeviceTimeOption"))).sendKeys(prop.getProperty("DeviceTime"));
		driver.findElement(By.xpath(prop.getProperty("TimeDropdown"))).click();
		driver.findElement(By.xpath(prop.getProperty("Minutes"))).click();
		driver.findElement(By.xpath(prop.getProperty("HowMuch?Button"))).click();
	}
}
