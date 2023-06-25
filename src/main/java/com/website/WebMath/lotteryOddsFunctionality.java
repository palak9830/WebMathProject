package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class lotteryOddsFunctionality extends WebMathBase{
	
   public void LotteryOddsCalculation() {
	   driver.findElement(By.xpath(prop.getProperty("LotteryOddsOption"))).click();
	driver.findElement(By.xpath(prop.getProperty("NumberedBallsOption"))).sendKeys(prop.getProperty("NumberedBall"));
	driver.findElement(By.xpath(prop.getProperty("LowestNumberOption"))).sendKeys(prop.getProperty("LowestNumber"));
	driver.findElement(By.xpath(prop.getProperty("HighestNumberOption"))).sendKeys(prop.getProperty("HighestNumber"));
	driver.findElement(By.xpath(prop.getProperty("WhatAreMyOddsButton"))).click();
}
}
