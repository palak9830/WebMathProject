package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class PowerTestcases extends WebMathBase{
	

	PowerFunctionality PF  ;
	@BeforeMethod
	public void Initialize() {
		 PF =new 	PowerFunctionality();
		 PF.Browse();
	}
	@Test
	public void Conversion() {
		PF.PowerCalculation();
	}
	@AfterMethod
	public void close() {
		PF.Teardown();
	}
	

}
