package com.covid20;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.main.help.Base1;

public class Test2 extends Base1 {
	
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
