package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	public EditLeadPage clickEdit()
	{
		clickByXpath(prop.getProperty("ViewLead.Edit.Xpath"));
		return new EditLeadPage(driver, test);
	}
	
	public MyLeadsPage clickDelete()
	{
		clickByClassName(prop.getProperty("ViewLead.Delete.ClassName"));
		return new MyLeadsPage(driver, test);
		
	}
	
	public DuplicateLeadPage clickDuplicate()
	{
		clickByXpath(prop.getProperty("ViewLead.Dupliacte.Xpath"));
		return new DuplicateLeadPage(driver, test);

	}
	
	public ViewLeadPage verifyFirstName(String firstName)
	{
		verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), firstName);
		return this;
	}
	
	public ViewLeadPage verifySource(String source)
	{
		verifyTextById(prop.getProperty("ViewLead.Sources.Id"), source);
		return this;
	}
	
	public ViewLeadPage verifyMarketCompaign(String marketCompaign)
	{
		verifyTextById(prop.getProperty("ViewLead.MarketCompaigns.Id"), marketCompaign);
		return this;
	}
}
