package com.website.WebMath;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class weightOnAnotherPlanetTestcases {

	weightOnAnotherPlanetFunctionality WAP;
	
	@BeforeMethod
	public void Initialize() {
		WAP= new weightOnAnotherPlanetFunctionality();
		WAP.Browse();
	}
	@Test
	public void WeightOnAnotherPlanet() {
		WAP.WeightOnAnotherPlanet();
	}
	@AfterMethod
	public void Close() {
		WAP.Teardown();
	}
}
