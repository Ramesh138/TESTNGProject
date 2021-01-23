package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Leads Page. Look at the SnapShot", "FAIL");
		}
	}


	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("MyLead.CreateLead.Link"));
		return new CreateLeadPage(driver,test);
	}
	
	
	public FindLeadsPage clickFindLeads()
	{
		clickByLink(prop.getProperty("MyLead.FindLeads.Link"));
		return new FindLeadsPage(driver, test);
	}
	
	public MergeLeadsPage clickMergeLeads()
	{
		clickByLink(prop.getProperty("MyLead.MergeLead.Link"));
		return new MergeLeadsPage(driver, test);
	}
	
}
