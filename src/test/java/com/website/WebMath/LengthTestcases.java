package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class LengthTestcases extends WebMathBase{

	LengthFunctionality LF ;
	@BeforeMethod
	public void Initialize() {
	LF	=new LengthFunctionality();
	LF.Browse();
	}
	@Test
	public void Conversion() {
		LF.LengthCalculation();
		
	}
	@AfterMethod
	public void close() {
		LF.Teardown();
	}
	
}
