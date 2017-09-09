package creditcards.test.automation.cccomUI.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home {

	protected WebDriver driver;	
    public @FindBy(how=How.XPATH, using ="//img[contains(@alt,'CreditCards.com')]") WebElement creditCardsLogo;
    public @FindBy(how=How.XPATH, using = "//img[contains(@alt,'0% APR')]") WebElement zeroAprTile;
    public  @FindBy(how=How.XPATH, using = "//h1[contains(.,'0% Intro APR Credit Cards')]") WebElement zeroPercentCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Balance Transfer')]") WebElement balanceTransferTile;
    public  @FindBy(how=How.XPATH, using = "//h1[contains(.,'Balance Transfer Credit Cards')]") WebElement balanceTransferCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Cash Back')]") WebElement cashBackTile;
    public  @FindBy(how=How.XPATH, using = "//h1[contains(.,'Cash Back Credit Cards')]") WebElement cashBackCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Travel and Airlines')]") WebElement travelAirlinesTile;
    public @FindBy(how=How.XPATH,using = "//h1[contains(.,'Travel and Airline Credit Cards')]") WebElement travelAirlinesCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Top Cards')]" ) WebElement topCardsTile;
    public @FindBy(how=How.XPATH,using = "//h2[contains(.,'Top Travel & Airline Credit Card')]" ) WebElement topCardsCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Rewards')]") WebElement rewardsTile;
    public @FindBy(how=How.XPATH,using = "//h1[contains(.,'Reward Credit Cards')]") WebElement rewardsCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[@alt='Fair Credit']" ) WebElement fairCreditTile;
    public @FindBy(how=How.XPATH,using = "//h1[contains(.,'Fair Credit')]") WebElement fairCreditCatTitle;
    public @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Poor Credit')]") WebElement poorCreditTile;
    public @FindBy(how=How.XPATH,using = "//h1[contains(.,'Credit Cards for Bad Credit')]" ) WebElement poorCreditCatTile;
    public @FindBy(how=How.XPATH,using ="//h2[contains(.,'Latest Credit Card News & Advice')]") WebElement newsHeading;
    public @FindBy(how=How.XPATH,using = "//a[contains(@class,'news__text__link')]")WebElement latestNewsTextLinks;
    
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   public Home verifyHomePageTiles () throws InterruptedException{
	   
	     System.out.println("Verify HomePage Tiles");
	     WebElement[] homePageTiles ={zeroAprTile,balanceTransferTile, cashBackTile, travelAirlinesTile,topCardsTile,rewardsTile,fairCreditTile,poorCreditTile};
	     WebElement[] pageTitle ={zeroPercentCatTitle,balanceTransferCatTitle, cashBackCatTitle, travelAirlinesCatTitle,topCardsCatTitle,rewardsCatTitle,fairCreditCatTitle,poorCreditCatTile};
	     
	   for (int i = 0; i<homePageTiles.length; i++){
		   
		  System.out.println("Home Page Tile is visible :" + homePageTiles[i].isDisplayed());
		   
		  System.out.println("Clicking HomePage Tile" + homePageTiles[i]);
		   
		  homePageTiles[i].click();
		  System.out.println("Category Title is visible: " + pageTitle[i].isDisplayed());
			
		  Thread.sleep(3000);
		driver.navigate().back();
		   
	   }
  
	   
	   return new Home(driver);
   }
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		
		String expectedPageTitle="Compare Credit Cards | CreditCards.com";
		return getPageTitle().contains(expectedPageTitle);
	}
	
	public String seeLatestCreditCardNewsAndAdviceHeading() {
		System.out.println("See Latest Credit Card News & Advice Heading");
	     String displayedHeading = newsHeading.getText();
	     return displayedHeading;
	}

}
