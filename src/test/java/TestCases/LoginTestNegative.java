package TestCases;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import BaseTest.BrowserBaseTest2;
import PageObject.LoginPage;
import Utils.ExtentListeners;
import Utils.TestData;
public class LoginTestNegative extends BrowserBaseTest2 {
	TestData tdata;
	ExtentListeners e=new ExtentListeners();
	JavascriptExecutor js;
	public LoginPage homepage;
	
	@Test
	public void TC01CalculateEMI() throws Exception 
	{
		
		e.test.log(Status.INFO,"Base URL open successfully");
		homepage=new LoginPage(driver);
		//close pop-up
        Thread.sleep(2300);
        homepage.getPopup().click();
        
        //click on arrow
        homepage.getArrow().click();
        
        //click on loan
        homepage.getClickOnloan().click();
        
        js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", " ");
        
		//clicl on explore more
        homepage.getExploreMore().click();
        js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", " ");
		
      //click on two wheeler icon

        homepage.gettwowheelericon().click();
        e.test.log(Status.INFO,"Click on Two wheeler is success");
        
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", " ");
         Thread.sleep(2000);
		//click on EMI Calculator 
                 
					
		try {
			tdata = new TestData();
			double p=tdata.Principal;
			double r=tdata.rate;
		    	
		    homepage.getLoanAmount().clear();
		  	homepage.getLoanAmount().sendKeys(String.valueOf(r));
		    e.test.log(Status.INFO,"principal value enter successfully");
			
			//click on calculate
			homepage.getEMICalculator().click();

			

		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	}

	public	static double emi_calculator(double p,double r, double t)
	{
		double emi;

		r = r / (12 * 100); 
		t = t * 12; 
		emi = (p * r * (float)Math.pow(1 + r, t)) 
				/ (float)(Math.pow(1 + r, t) - 1);
		return emi;
	}
	}
	


