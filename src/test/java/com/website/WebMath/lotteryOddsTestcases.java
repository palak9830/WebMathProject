package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.website.WebMathBase.WebMathBase;

public class lotteryOddsTestcases extends WebMathBase {

	lotteryOddsFunctionality LO;
	
	@BeforeMethod
	public void Initialize() {
		LO= new lotteryOddsFunctionality();
		LO.Browse();
	}
	@Test
	public void LotteryOdds() {
		LO.LotteryOddsCalculation();
		
	}
	@AfterMethod
	public void close() {
		LO.Teardown();
	}
}
