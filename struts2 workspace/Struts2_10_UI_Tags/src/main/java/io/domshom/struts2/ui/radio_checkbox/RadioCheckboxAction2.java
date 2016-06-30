package io.domshom.struts2.ui.radio_checkbox;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RadioCheckboxAction2 extends ActionSupport{
	private List<String> genders;
	private List<Country> countries ;
	
	private String selectedGender;
	private String selectedCountry;
	private String selectedChoice;
	
	private static final String MALE = "male";
	private static final String FEMALE = "female";
	private static final String NOT_SELECTED = "not_selected";
	
	public RadioCheckboxAction2(){
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		
		countries = new ArrayList<Country>();
		countries.add( new Country("ENGLAND", "English") );
		countries.add( new Country("FRANCE", "France") );
		countries.add( new Country("CHINA", "Chinese") );
		countries.add( new Country("GERMANY", "German") );
		countries.add( new Country("INDIA", "Hindi") );
	}
	
	//return default gender value
	public String getDefaultGender(){
		return MALE;
	}

	//return default language value
	public String getDefaultCountry(){
		return "INDIA";
	}
	
	public String execute() {
		return SUCCESS;
	}
	public String display() {
		return NONE;
	}

	public List<String> getGenders() {
		return genders;
	}

	public void setGenders(List<String> genders) {
		this.genders = genders;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public String getSelectedGender() {
		return selectedGender;
	}

	public void setSelectedGender(String selectedGender) {
		this.selectedGender = selectedGender;
	}

	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public String getSelectedChoice() {
		return selectedChoice;
	}

	public void setSelectedChoice(String selectedChoice) {
		this.selectedChoice = selectedChoice;
	}
	
}
