package io.domshom.struts2.ui.radio_checkbox;

public class Language{

	private String languageCode;
	private String languageDisplay;
	
	
	
	public String getLanguageCode() {
		return languageCode;
	}



	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}



	public String getLanguageDisplay() {
		return languageDisplay;
	}



	public void setLanguageDisplay(String languageDisplay) {
		this.languageDisplay = languageDisplay;
	}



	public Language(String languageCode, String languageDisplay) {
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
}