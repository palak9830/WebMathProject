package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class mathForEveryoneUI extends WebMathBase{
	
	public boolean MathForEveryone() {
		driver.findElement(By.xpath(prop.getProperty("EverydayMath"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("PersonalFinance"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("UnitConversion"))).isDisplayed();
		driver.findElement(By.xpath(prop.getProperty("Math@Home"))).isDisplayed();
		return driver.findElement(By.xpath(prop.getProperty("Math&Beyond"))).isDisplayed();
	}

}
