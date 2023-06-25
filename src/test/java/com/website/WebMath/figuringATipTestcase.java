package com.website.WebMath;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class figuringATipTestcase extends WebMathBase {

	figuringATipFunctionality FT;
	
	@BeforeMethod
	public void Initialize() throws Exception {
		FT= new figuringATipFunctionality();
			FT.Browse();
	}
	@Test
	public void FiguringATip() {
		FT.FiguringATipSection();
	}
	@AfterMethod
	public void close() {
	FT.Teardown();
		
	}
}
