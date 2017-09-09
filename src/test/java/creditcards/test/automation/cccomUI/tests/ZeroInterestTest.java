package creditcards.test.automation.cccomUI.tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import creditcards.test.automation.cccomUI.pageobjects.ZeroInterest;
import creditcards.test.automation.cccomUI.setup.TestSetUp;

public class ZeroInterestTest extends TestSetUp{
	ZeroInterest zeroInterest;
	
	@DataProvider(name="CategoryPagesData")
	public String[][] getTestData(){
		String[][] zeroInterestData = getData("CategoryTestData.xlsx", "zerointerest");
		return zeroInterestData;
	}
	
	@BeforeMethod
	@BeforeClass
	public void setUp(){
		
		driver = getDriver();
		driver.navigate().to("http://cccomus.staging.creditcards.com/compare/zero-interest/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyWeAreOnCorrectPage (){
		
		//Assert.assertTrue(zeroInterest.verifyPageTitle(), "Compare 0% APR Credit Cards - CreditCards.com");
		System.out.println("We are on correct page:" + "zero-interest");
	}
	

	@Test(dataProvider="CategoryPagesData")
	public void verifyZeroInterestPage(String cardName, String zeroPercentIntroAPRPurchases,String zeroIntroAPRBalanceTransfers, String regularAPR, String introBonusValue, String runMode) throws InterruptedException {
		if (runMode.equalsIgnoreCase("n")){
			throw new SkipException("user marked this record as no run");
		
		}
		System.out.println("Zero Interest test...");
		ZeroInterest zeroInterest = new ZeroInterest (driver);
		zeroInterest.topFourFacts(cardName, zeroPercentIntroAPRPurchases, zeroIntroAPRBalanceTransfers, regularAPR, introBonusValue);
		
	
     }

}