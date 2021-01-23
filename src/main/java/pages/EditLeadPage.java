package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{
	
	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	public EditLeadPage selectMarketCompaign(String visibleText)
	{
		selectVisibileTextById(prop.getProperty("CreateLead.OwnerShip.Id"), visibleText);
		return this;
	}
	
	public EditLeadPage addMarketCompaign()
	{
		clickByXpath(prop.getProperty("EditLead.AddMarketingCompaign.Xpath"));
		return this;
	}
	
	public EditLeadPage selectSource(String visibleText)
	{
		selectVisibileTextById(prop.getProperty("EditLead.Source.Id"), visibleText);
		return this;
	}
	
	public EditLeadPage addSource()
	{
		clickByXpath(prop.getProperty("EditLead.AddSource.Xpath"));
		return this;
	}
	
	public ViewLeadPage update()
	{
		clickByXpath(prop.getProperty("EditLead.Update.Xpath"));
		return new  ViewLeadPage(driver, test);
	}
}
