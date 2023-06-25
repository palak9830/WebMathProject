package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class salePriceFunctionality extends WebMathBase {
	
	public void SalePriceCalculation() {
		driver.findElement(By.xpath(prop.getProperty("SalePriceOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("OriginalCostSection"))).sendKeys(prop.getProperty("OriginalCost"));
		driver.findElement(By.xpath(prop.getProperty("PercentOffSection"))).sendKeys(prop.getProperty("PercentOff"));
		driver.findElement(By.xpath(prop.getProperty("FigureCostButton"))).click();
	}

}
