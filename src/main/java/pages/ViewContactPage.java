package pages;

import wrappers.OpentapsWrappers;

public class ViewContactPage extends OpentapsWrappers {

	public ViewContactPage ClickQualityLead() {
    	clickByLink(prop.getProperty("ViewContactPage.ClickQualityLead.Link"));
		return this;
	}
	
	public ViewContactPage ClickFirstConvertLead() {
    	clickByLink(prop.getProperty("ViewContactLeadPage.ClickFirstConvertLead.Link"));
		return this;
	}
	
	public ViewContactPage ClickSecondConvertLead() {
    	clickByName(prop.getProperty("ViewContactLeadPage.ClickSecondConvertLead.Name"));
    	return this;
	}
	
	public 
	
	
	
}
