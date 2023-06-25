package com.website.WebMath;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class everydayMathUITestcases extends WebMathBase{

	everydayMathUI EM;
	
	@BeforeMethod
	public void Initialize() {
		EM= new everydayMathUI();
		EM.Browse();
	}
	@Test
	public void EverydayMathUI() {
		Assert.assertTrue(EM.EverydayMath());
	}
	@AfterMethod
	public void close() {
		EM.Teardown();
	}
}
