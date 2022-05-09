package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		//Set the Property of the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\"
				+ "eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
		//Create Object for WebDriver
		WebDriver driver = new ChromeDriver();
		//to launch the url
		driver.get("https://www.facebook.com/");
		
	}

}
