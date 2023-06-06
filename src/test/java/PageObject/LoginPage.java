package PageObject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage  {
	AndroidDriver ldriver;
	public LoginPage(AndroidDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	//Pop-Up
    @FindBy(xpath="(//a[@class='close'])[1]") WebElement Popup;

        public WebElement getPopup() {
            return Popup;


        }
	
     //click on arraow
        @FindBy(xpath="//div[@class='swiper-button-next swiper-button-white']") WebElement arrow;
        public WebElement getArrow() {
			return arrow;
		}
        //click on loan
        @FindBy(xpath="(//a[@class='nav-link'])[5]") WebElement clickOnloan;
         public WebElement getClickOnloan() {
			return clickOnloan;
		}
         //click on explore more
         @FindBy(xpath="(//a[@class='link_view normal-text deeplink'])[10]")WebElement exploreMore;
        
         public WebElement getExploreMore() {
 			return exploreMore;
 		}     
     	
        //click on two wheeler icon 
            @FindBy(xpath="(//*[contains(text(),'Two Wheelers')])[1]") WebElement twowheelericon;
            public WebElement gettwowheelericon() {
                return twowheelericon;
            }

	//click on EMI Calculator tab 
	@FindBy(xpath="//a[@id='loanCalculate']") WebElement EMICalculator;

	public WebElement getEMICalculator() {
		return EMICalculator;


	}
	//loan requirment
	@FindBy(xpath="//*[@id='loanAmount']") WebElement loanAmount;

	public WebElement getLoanAmount() {
		return loanAmount;
	}
	//interest rate 
	@FindBy(xpath="(//span[@class='vehicleLoanPrincipleError'])[1]")WebElement error;

	public WebElement getError() {
		return error;
	}

	//loan amount 
	@FindBy(xpath="//input[@id='yr']") WebElement Loan_Amount;

	public WebElement getLoan_Amount() {
		return Loan_Amount;
	}

	 //get EMI amount 
	@FindBy(xpath="//p[@class='f48 emi_value']")WebElement EMIamount;

	public WebElement getEMIamount() {
		return EMIamount;
	}
	
	//get Principal amount for assertion 
	@FindBy(xpath="//p[@class='f24 total_principal']") WebElement principal_amt;

	public WebElement getPrincipal_amt() {
		return principal_amt;
	}
	
	//get interest payable for assertion 
	@FindBy(xpath="//p[@class='f24 total_interest']") WebElement interest_payable;

	public WebElement getInterest_payable() {
		return interest_payable;
	}

    //get total payment 
	@FindBy(xpath="//p[@class='f24 total_payment']") WebElement total_payment;

	public WebElement getTotal_payment() {
		return total_payment;
	}

	
	//footer display
	@FindBy(xpath="//footer[@class='footer']") WebElement footer;

	public WebElement getFooter()
	{
		return footer;
	}

	//logo is display 
	@FindBy(xpath="//img[@class=' lazyloaded'][1]")WebElement logo;

	public WebElement getLogo() {
		return logo;
	}
	
	

}
