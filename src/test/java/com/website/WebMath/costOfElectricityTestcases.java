package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class costOfElectricityTestcases extends WebMathBase {

	costOfElectricityFunctionality COE;
	
	@BeforeMethod
	public void Initialize() {
	COE= new costOfElectricityFunctionality();
	COE.Browse();
	}
	@Test
	public void CostOfElectricity() {
		COE.CostOfElectricity();
		
	}
	@AfterMethod
	public void close() {
		COE.Teardown();
		
	}
	
}
