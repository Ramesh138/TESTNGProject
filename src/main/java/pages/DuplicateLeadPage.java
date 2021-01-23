package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class DuplicateLeadPage extends OpentapsWrappers {

	public DuplicateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not Duplicate Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	public DuplicateLeadPage verifyTitle()
	{
		verifyTextById(prop.getProperty("DuplicateLead.Title.Id"), "Duplicate Lead");
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		clickByName(prop.getProperty("DuplicateLead.CreateLead.Name"));
		return new ViewLeadPage(driver, test);
	}
}
