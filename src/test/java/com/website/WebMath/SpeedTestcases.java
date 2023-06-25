package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class SpeedTestcases extends WebMathBase {


	SpeedFunctionality SF ;
	@BeforeMethod
	public void Initialize() {
		SF =new SpeedFunctionality();
		SF.Browse();
	}
	@Test
	public void Conversion() {
		SF.SpeedCalculation();
	}
	@AfterMethod
	public void close() {
		SF.Teardown();
		
	}
	
}
