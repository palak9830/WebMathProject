package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class salePriceTesetcases extends WebMathBase{
	
	salePriceFunctionality SP;
	
	@BeforeMethod
	public void Initialize() {
	SP= new salePriceFunctionality();
	SP.Browse();
	}
	@Test
	public void salePriceTestcase() {
		SP.SalePriceCalculation();
	}
	@AfterMethod
	public void Close() {
		SP.Teardown();
	}

}
