package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class MassTestcases extends WebMathBase{


	MassFunctionality  MF  ;
	@BeforeMethod
	public void Initialize() {
	MF	=new MassFunctionality();
	MF.Browse();
	}
	@Test
	public void Conversion() {
		MF.MassCalculation();
	}
	@AfterMethod
	public void close() {
		MF.Teardown();
	}
	
}
