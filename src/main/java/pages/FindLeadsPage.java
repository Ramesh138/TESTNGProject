package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM"))
			reportStep("This is not Find Leads Page", "FAIL");
	}
	
	public FindLeadsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FindLead.FirstName.Xpath"), data);
		return this;

	}

	public FindLeadsPage clickFindLeads() {
		clickByXpath(prop.getProperty("FindLead.FindLeads.Xpath"));
		return this;		
	}
	
	public FindLeadsPage clickPhoneTab()
	{
		clickByXpath(prop.getProperty("FindLead.PhoneTab.Xpath"));
		return this;
	}
	
	public FindLeadsPage clickEmailTab()
	{
		clickByXpath(prop.getProperty("FindLead.EmailTab.Xpath"));
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String phoneNo)
	{
		enterByName(prop.getProperty("FindLead.PhoneNumber.Name"), phoneNo);
		return this;
	}
	
	public FindLeadsPage enterEmailAddress(String emailId)
	{
		enterByName(prop.getProperty("FindLead.EmailAddress.Name"), emailId);
		return this;
	}

	public ViewLeadPage clickFirstResultingLead() {
		clickByXpath(prop.getProperty("FindLead.FirstResultLead.Xpath"));
		return new  ViewLeadPage(driver, test);		
	}
	
	
	public FindLeadsPage verifyErrorMessage(String data) {		
		verifyTextByClassName(prop.getProperty("FindLead.ErrorMessage.ClassName"), "No records to display");		
		return this;		
	}
	
	
	public FindLeadsPage clickAdvancedTab(){
		
		clickByXpath(prop.getProperty("FindLead.AdvancedTab.Xpath"));
		return this;
					
	}
	
	public void getTxt(String valu)
	{
		valu =  getTextById(idVal);
	}
	
	public FindLeadsPage clickSecondResult(){
		clickByXpath(prop.getProperty("FindLead.SecondResultLead.Xpath"));
		return this;		
			}
	
	public FindLeadsPage verifyDeletion(String text){
		verifyTextByXpath(prop.getProperty("FindLead.VerifyDeletion.Xpath"), text);
		return this;
	}
		
}