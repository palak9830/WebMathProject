package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class VolumeFunctionality extends WebMathBase{

	public void VolumeCalculation() {
		driver.findElement(By.xpath(prop.getProperty("VolumeOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("VolumeValue"))).sendKeys(prop.getProperty("Volume"));
		driver.findElement(By.xpath(prop.getProperty("ConvertVolume"))).click();
	}
}





