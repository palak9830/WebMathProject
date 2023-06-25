package com.website.WebMath;

import com.website.WebMathBase.WebMathBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class mathForEveryoneUITestcases extends WebMathBase {

	mathForEveryoneUI MFE;
	
	@BeforeMethod
	public void Initialize() {
	MFE =new mathForEveryoneUI();
	MFE.Browse();
	}
	@Test
	public void MathForEveryoneTeastcases() {
	Assert.assertTrue(MFE.MathForEveryone());
	}
	@AfterMethod
	public void Close() {
		MFE.Teardown();
	}
}
