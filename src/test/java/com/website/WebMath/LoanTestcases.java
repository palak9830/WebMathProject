package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class LoanTestcases extends WebMathBase{

	LoanFunctionality LF;
	
	@BeforeMethod
	public void Initialize() {
		LF= new LoanFunctionality();
		LF.Browse();
	}
	@Test
	public void LoanCalculationTestcase() {
		LF.LoanCalculation();
	}
	@AfterMethod
	public void close() {
		LF.Teardown();
	}
}
