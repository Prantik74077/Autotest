package com.jenkins;

import org.testng.annotations.Test;

public class Test1 
{
   @Test
   public void Createcontact()
   {
	   String URL = System.getProperty("url");
	   String BROWSER = System.getProperty("browser");
	   
	   System.out.println(URL);
	   System.out.println(BROWSER);
   }
}
