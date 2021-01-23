package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MergeLeadsPage extends OpentapsWrappers{
	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Leads Page. Look at the SnapShot", "FAIL");
		}
	}
	
	public FindMergeLeadsPage clickFromLead()
	{
		clickByXpath(prop.getProperty("MergeLead.FromLead.Xpath"));
		switchToLastWindow(2);
		return new FindMergeLeadsPage(driver, test);
	}
	
	public FindMergeLeadsPage clickToLead()
	{
		clickByXpath(prop.getProperty("MergeLead.ToLead.Xpath"));
		switchToLastWindow(2);
		return new FindMergeLeadsPage(driver, test);
	}
	
	public MergeLeadsPage clickMergeLead()
	{
		clickByClassName("buttonDangerous");
		return this;
	}
	
	public ViewLeadPage confirmMerge()
	{
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
}
