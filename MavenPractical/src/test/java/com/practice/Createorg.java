package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Createorg 
{
	public WebDriver driver;
	@Test(groups ="smokeTest")
	public void createorg()
	{
	   String BROWSER=System.getProperty("browser");
	   if(BROWSER.equals("chrome")) 
	   {
	  		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	  		driver=new ChromeDriver();
	   }
	   else
	   {
		    System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
	  		driver=new FirefoxDriver();
	   }
	    	  
	    	  String URL=System.getProperty("url");
	    	  driver.get(URL);
	    	  System.out.println("execute create org");
	    	  System.out.println("URL===>"+URL);
	    	  System.out.println("BROWSER===>"+BROWSER);
	      }
	         
	      @Test(groups = "regressionTest")
	      public void createorgwithMobile()
	      {
	    	  System.out.println("execute create org with mobile");
	      }
	}