package creditcards.test.automation.cccomUI.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ZeroInterest {
	public WebDriver driver;
	
	    public  @FindBy(how=How.XPATH, using = "//h1[contains(.,'0% Intro APR Credit Cards')]") WebElement zeroPercentCatTitle;
	    public  @FindBy(how=How.XPATH, using = "//a[contains(@class,'product-box__title__link')]") WebElement productBoxLinkedTitle;
	    private @FindBy(how=How.XPATH,using = "//p[contains(.,'0% Intro APR - Purchases')]") WebElement zeroIntroAPRPurchasesHead;
	    public  @FindBy(how=How.XPATH, using = "//p[contains(.,'0% Intro APR - Balance Transfers')]") WebElement zeroAPRBalanceTransfersHead;
	    private @FindBy(how=How.XPATH,using = "//p[contains(.,'Regular APR')]") WebElement regularAPRHead;
	    private @FindBy(how=How.XPATH,using = "//p[contains(.,'Intro Bonus Value')]" ) WebElement introBonusValueHead;
	    public @FindBy(how=How.XPATH, using = "//div[contains(@class,'product-box__rate-value')]") WebElement productBoxToolTipValue;
	    
	    public ZeroInterest(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	    
	
	public ZeroInterest topFourFacts(String cardName, String zeroPercentIntroAPRPurchases, String zeroIntroAPRBalanceTransfers, String regularAPR, String introBonusValue) throws InterruptedException {
		System.out.println("See the Four Top Facts");
	    
		System.out.println(" Displaying productBoxLinkedTitle");
		Assert.assertTrue(productBoxLinkedTitle.isDisplayed());
		
		 WebElement[] toolTipHeading ={zeroIntroAPRPurchasesHead,zeroAPRBalanceTransfersHead, regularAPRHead, introBonusValueHead};
		 
		   for (int i = 0; i<toolTipHeading.length; i++){
			   
			  System.out.println("4 facts tooltip heading is visible:" + toolTipHeading[i].isDisplayed());
		   }
		System.out.println("The title of the card is visible:" + cardName +":" + productBoxLinkedTitle.getText().equals(cardName));
		
		//productBoxLinkedTitle.equals(cardName);
		System.out.println("Data from Excel:" + " | " + cardName + " | " +  zeroPercentIntroAPRPurchases + " | " + zeroIntroAPRBalanceTransfers + " | " + regularAPR + " | " + introBonusValue );
		
		 
		 Thread.sleep(3000);
		return new ZeroInterest(driver);
	}
	 

	public ZeroInterest seeCardDetails() {
		System.out.println("See Card Details");
		return new ZeroInterest(driver);	
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		
		String expectedPageTitle="Compare 0% APR Credit Cards - CreditCards.com";
		return getPageTitle().contains(expectedPageTitle);
	}

	
	
}
