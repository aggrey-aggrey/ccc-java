package creditcards.test.automation.cccomUI.tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import creditcards.test.automation.cccomUI.pageobjects.Home;
import creditcards.test.automation.cccomUI.setup.TestSetUp;


public class HomeTest extends TestSetUp {

	private WebDriver driver;
	Home homePage;
	
	@BeforeMethod
	@BeforeClass
	public void setUp(){
		driver = getDriver();
	}
	@Test
	public void verifyHomePage() throws InterruptedException {
		System.out.println("Home page test...");
		Home homePage = new Home (driver);
		//Assert.assertTrue(homePage.verifyPageTitle(), "Compare Credit Cards | CreditCards.com");
		homePage.verifyHomePageTiles();
        getScreenShot("verifyHomePage");
		Assert.assertEquals(homePage.seeLatestCreditCardNewsAndAdviceHeading(),"LATEST CREDIT CARD NEWS & ADVICE");
		
	}

}
