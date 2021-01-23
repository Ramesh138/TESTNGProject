package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindMergeLeadsPage extends OpentapsWrappers{

	public FindMergeLeadsPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Find Leads"))
			reportStep("This is not Find Merge Leads Page", "FAIL");
	}
	
	public FindMergeLeadsPage enterFirstName(String firstName) {
		enterByXpath(prop.getProperty("FindMergeLead.FirstName.Xpath"), firstName);
		return this;

	}
	
	public FindMergeLeadsPage enterLeadId(String leadId) {
		enterByXpath(prop.getProperty("FindMergeLead.LeadId.Xpath"), leadId);
		return this;

	}
	public FindMergeLeadsPage clickFindLeads() {
		clickByXpath(prop.getProperty("FindMergeLead.FindLeads.Xpath"));
		return this;		
	}
	
	public MergeLeadsPage clickFirstResultingLead() {
		clickByXpath(prop.getProperty("FindMergeLead.FirstResultLead.Xpath"));
		switchToParentWindow();
		return new  MergeLeadsPage(driver, test);		
	}
}
