package creditcards.test.automation.cccomUI.pageobjects;

//import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import creditcards.test.automation.cccomUI.setup.TestSetUp;


public class HeaderNav extends TestSetUp{
	 private WebDriver driver;
	 public  @FindBy(how=How.XPATH, using = "//span[contains(.,'LOW RATES & FEES')]") WebElement lowRatesAndFeesTopNav;
	 public @FindBy(how=How.XPATH, using = "//span[contains(.,'Low Rates')]") WebElement lowRatesNavText;
	 public @FindBy(how=How.XPATH,using = "//span[contains(.,'No Fees')]") WebElement noFeesText;
	 public @FindBy(how=How.XPATH, using = "//a[contains(.,'Balance Transfers')]") WebElement balanceTransferNav;
	 public @FindBy(how=How.XPATH, using = "//a[contains(.,'0% APR')]") WebElement zeroAprNav;
	 public @FindBy(how=How.XPATH, using = "//a[contains(.,'Low Interest')]") WebElement lowInterestNav;
	 public @FindBy(how=How.XPATH, using = "//a[contains(.,'No Annual Fee')]") WebElement noAnnualFeeNav;
	 public @FindBy(how=How.XPATH, using = "//a[contains(.,'No Foreign Transaction Fee')]") WebElement noForeignTransactionFeeNav;
	 
	 public @FindBy(how=How.XPATH,using = "//span[contains(.,'TRAVEL & REWARDS')]") WebElement travelAndRewardsTopNav;
     public @FindBy(how=How.XPATH,using = "//span[contains(.,'Cards for Travel')]") WebElement cardForTravelText;
     public @FindBy(how=How.XPATH, using = "//span[contains(.,'Earn Rewards')]") WebElement earnRewardsText;
     public @FindBy(how=How.XPATH, using = "//span[contains(.,'Tools')]") WebElement toolsText;
     public @FindBy(how=How.XPATH, using = "//a[contains(.,'Travel & Airlines')]") WebElement travelAndAirlinesNav;
     public @FindBy(how=How.XPATH, using = "//a[contains(.,'Hotels')]") WebElement hotelNav;
     public @FindBy(how=How.XPATH, using = "//a[contains(.,'No Foreign Transaction Fee')]") WebElement noForeignTransacionFeeNav;
     public @FindBy(how=How.XPATH, using = "//span[contains(.,'Tools')]") WebElement toolsNav;
	
     
	 public HeaderNav(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}


	 public HeaderNav verifyHeaderNavLowRatesAndFees () throws InterruptedException{
		 
		 WebElement[] lowRatesAndFeesItems = {balanceTransferNav,zeroAprNav,lowInterestNav,noAnnualFeeNav,noForeignTransactionFeeNav};
		
		 
	for (int i= 0; i < lowRatesAndFeesItems.length; i++){
         
		 Actions builder = new Actions(driver);
		 
		 

		 builder.moveToElement(lowRatesAndFeesTopNav).perform();
		 System.out.println("Text: Low Rates is displayed : " + lowRatesNavText.isDisplayed());
		
		 Thread.sleep(5000L);
		 // Clicking on the Hidden SubMenu
		
		 System.out.println("Sub Nav menu is displayed : " + lowRatesAndFeesItems[i].isDisplayed());
		 System.out.println("Clicking " + lowRatesAndFeesItems[i]);
		 lowRatesAndFeesItems[i].click();
		 Thread.sleep(8000L);
		 
		 //waitForElement(5000, lowRatesAndFeesTopNav);
		 builder.moveToElement(lowRatesAndFeesTopNav).perform();
		 
		 
		 
	}
			
		return new HeaderNav(driver);
	
}
	 
}
