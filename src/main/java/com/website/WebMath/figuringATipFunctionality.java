package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class figuringATipFunctionality extends WebMathBase{

	public void FiguringATipSection() {
		
		driver.findElement(By.xpath(prop.getProperty("FiguringATip"))).click();
			driver.findElement(By.xpath(prop.getProperty("MealCostOption"))).sendKeys(prop.getProperty("MealCost"));
			driver.findElement(By.xpath(prop.getProperty("FigureTipbutton"))).click();
			//driver.findElement(By.xpath("//*[@id=\\\"d-childMainContLeft\\\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input")).sendKeys("MealCost");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
