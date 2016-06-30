package io.domshom.struts2.ui.radio_checkbox;

public class Country {
	private String name;
	private String language;
	
	public Country(String language, String name) {
		this.language = language;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
