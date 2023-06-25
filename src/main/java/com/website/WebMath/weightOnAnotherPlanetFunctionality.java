package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class weightOnAnotherPlanetFunctionality extends WebMathBase{
	
	public void WeightOnAnotherPlanet() {
		driver.findElement(By.xpath(prop.getProperty("WeightOnAnotherPlanetOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("MyWeight"))).sendKeys(prop.getProperty("Weight"));
		driver.findElement(By.xpath(prop.getProperty("PlanetDropdown"))).click();
		driver.findElement(By.xpath(prop.getProperty("Venus"))).click();
		driver.findElement(By.xpath(prop.getProperty("HowMuchWouldIWeigh"))).click();
	}

}
