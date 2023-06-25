package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class windChillTestcases extends WebMathBase{

	windChillFunctionality WC;

	@BeforeMethod
	public void Initialize() {
	WC= new windChillFunctionality();
	WC.Browse();
	}
	@Test
	public void WindChillTestcase() {
		WC.WindChillCalculations();
	}
	@AfterMethod
	public void Close() {
		WC.Teardown();
	}
}
