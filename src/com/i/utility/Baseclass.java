package com.i.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass
{
     public static WebDriver driver;
     public static void OpenBrowserApp()
     {
	 System.setProperty("webdriver.chrome.driver","C:\\Haibat\\Softwares\\Browsers\\Chrome\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to("https://the-internet.herokuapp.com/");
	 }
     
    
     public static void OpenAnotherBrowserApp() {
 		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
 		
 	}
     
     public static void CloseBrowserApp()
     {
    	 driver.quit();
     }

	
}