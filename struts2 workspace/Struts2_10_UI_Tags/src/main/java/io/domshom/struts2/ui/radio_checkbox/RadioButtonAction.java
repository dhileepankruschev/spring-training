package io.domshom.struts2.ui.radio_checkbox;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RadioButtonAction extends ActionSupport{

	private List<String> genders;
	private List<Language> languages;
	private List<Country> countries;
	
	private String selectedGender;
	private String selectedAnswer;
	private String selectedLanguage;
	private String selectedCountry;
	
	private static final String MALE = "male";
	private static final String FEMALE = "female";
	private static final String UNKNOWN = "unknown";
	
	public RadioButtonAction(){
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(UNKNOWN);
		
		languages = new ArrayList<Language>();
		languages.add( new Language("EN", "English") );
		languages.add( new Language("FR", "France") );
		languages.add( new Language("CN_ZH", "Chinese") );
		languages.add( new Language("DE", "German") );
		
		countries = new ArrayList<Country>();
		countries.add( new Country("ENGLAND", "English") );
		countries.add( new Country("FRANCE", "France") );
		countries.add( new Country("CHINA", "Chinese") );
		countries.add( new Country("GERMANY", "German") );
		countries.add( new Country("INDIA", "Hindi") );

	}
	
	//return default gender value
	public String getDefaultGenderValue(){
		return UNKNOWN;
	}

	//return default language value
	public String getDefaultLanguageValue(){
		return "CN_ZH";
	}
	
	//return default language value
	public String getDefaultCountryValue(){
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

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
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

	public String getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(String selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

	public String getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(String selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public String getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(String selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public static String getMale() {
		return MALE;
	}

	public static String getFemale() {
		return FEMALE;
	}

	public static String getUnknown() {
		return UNKNOWN;
	}
			
}