package com.covid;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.main.help.Base1;

public class Test1 extends Base1{
	
	
	@Test
	public void login1() {
		System.out.println("Current URL of the page "+d.getCurrentUrl());
		String s=d.getTitle();
		System.out.println("Title of the page "+s);
	}
	//http://maven.apache.org/surefire/maven-surefire-plugin/usage.html

	@Test
	public void login2() {
		d.navigate().to("https://www.facebook.com/");

		System.out.println("Title of the facebok page "+d.getTitle());
		d.navigate().back();
		System.out.println("Title of the current page "+d.getTitle());
	}
		
		@AfterMethod
		
		public void teardown() {
			
			d.quit();
			System.out.println("Browser is closed");
			
		}

}
