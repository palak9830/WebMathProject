package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class AreaTestcases extends WebMathBase{

	AreaFunctionality  AF;
	@BeforeMethod
	public void Initialize() {
	AF	=new AreaFunctionality();
	AF.Browse();
	}
	@Test
	public void AreaConversion() {
		AF.AreaCalculation();
	}
	@AfterMethod
	public void close() {
		AF.Teardown();
	}
	
	
}
