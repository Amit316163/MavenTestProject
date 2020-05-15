package com.main.help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
	
	protected static WebDriver d;
	@BeforeMethod
	public void login() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\Desktop\\JARS\\chromedriver_win32\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://testautomationpractice.blogspot.com/");	
		d.manage().window().maximize();	
	}
	

}
