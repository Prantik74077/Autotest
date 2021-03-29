package com.practice;

import org.testng.annotations.Test;

public class Createcontact 
{
      @Test(groups ="smokeTest")
      public void createcontact()
      {
    	  System.out.println("execute create contact");
      }
         
      @Test(groups ="regressionTest")
      public void createcontactwithMobile()
      {
    	  System.out.println("execute create contact with mobile");
      }
}