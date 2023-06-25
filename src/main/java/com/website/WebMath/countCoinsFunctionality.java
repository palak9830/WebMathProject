package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class countCoinsFunctionality extends WebMathBase {

	public void CountCoinsCalcuation() {
		driver.findElement(By.xpath(prop.getProperty("CountCoinsOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("QuarterOption"))).sendKeys(prop.getProperty("Quarter"));
		driver.findElement(By.xpath(prop.getProperty("DimeOption"))).sendKeys(prop.getProperty("Dime"));
		driver.findElement(By.xpath(prop.getProperty("NickelOption"))).sendKeys(prop.getProperty("Nickel"));
		driver.findElement(By.xpath(prop.getProperty("PenniesOption"))).sendKeys(prop.getProperty("Pennies"));
		driver.findElement(By.xpath(prop.getProperty("HelpMeCountItButton"))).click();
	}
}
