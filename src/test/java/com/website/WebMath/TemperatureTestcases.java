package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class TemperatureTestcases extends WebMathBase{
	

	TemperatureFunctionality TF ;
	@BeforeMethod
	public void Initialize() {
		TF =new TemperatureFunctionality ();
		TF.Browse();
	}
	@Test
	public void Conversion() {
		TF.TemperatureCalculation();
	}
	@AfterMethod
	public void close() {
		TF.Teardown();
	}
	

}
