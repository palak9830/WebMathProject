package com.website.WebMath;

import org.openqa.selenium.By;

import com.website.WebMathBase.WebMathBase;

public class LoanFunctionality extends WebMathBase{

	public void LoanCalculation() {
		driver.findElement(By.xpath(prop.getProperty("LoanOption"))).click();
		driver.findElement(By.xpath(prop.getProperty("LoanAmountOption"))).sendKeys(prop.getProperty("LoanAmount"));
		driver.findElement(By.xpath(prop.getProperty("LoanDurationOption"))).sendKeys(prop.getProperty("LoanDuration"));
		driver.findElement(By.xpath(prop.getProperty("PaymentPerYearOption"))).sendKeys(prop.getProperty("PaymentPerYear"));
		driver.findElement(By.xpath(prop.getProperty("AnnualInterestRateOption"))).sendKeys(prop.getProperty("AnnualInterestRate"));
		driver.findElement(By.xpath(prop.getProperty("ExtraAmountOption"))).sendKeys(prop.getProperty("ExtraAmount"));
		driver.findElement(By.xpath(prop.getProperty("ShowMeLoanPaymentSchedule"))).click();
	}
	
}
