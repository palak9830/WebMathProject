package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class countCoinsTestcases {

	countCoinsFunctionality CC;
	
	@BeforeMethod
	public void Initialize() {
		CC= new countCoinsFunctionality();
		CC.Browse();
	}
	@Test
	public void CountCoins() {
		CC.CountCoinsCalcuation();
	}
	@AfterMethod
	public void Close() {
		CC.Teardown();
	}
}
