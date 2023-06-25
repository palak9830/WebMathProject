package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class VolumeTestcases extends WebMathBase{

	

	VolumeFunctionality  VF;
	@BeforeMethod
	public void Initialize() {
	VF	=new VolumeFunctionality();
	VF.Browse();
		
	}
	@Test
	public void Conversion() {
		VF.VolumeCalculation();
	}
	@AfterMethod
	public void close() {
		VF.Teardown();
	}
	
}
