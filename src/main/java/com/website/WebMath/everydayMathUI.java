package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class everydayMathUI extends WebMathBase{

	public boolean EverydayMath() {
		
		
		driver.findElement(By.xpath(prop.getProperty("FiguringATip"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("SalePrice"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("WindChill"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("CountCoins"))).isDisplayed();
		return driver.findElement(By.xpath(prop.getProperty("LotteryOdds"))).isDisplayed();
	
	
}
}