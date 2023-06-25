package com.website.WebMathBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMathBase {

	public static ChromeDriver driver;
	public static Properties prop;

	public void PropertyFile()  {
		String Filepath= "./src/main/java/config/properties/WebMath Data";
		prop= new Properties();
		try {
			FileInputStream file= new FileInputStream(Filepath);
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Browse()  {
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			PropertyFile();
			driver= new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("URL"));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[text()='Math for Everyone']")).click();
				
		}
	
	public void Teardown() {
		driver.close();
	}
	}

