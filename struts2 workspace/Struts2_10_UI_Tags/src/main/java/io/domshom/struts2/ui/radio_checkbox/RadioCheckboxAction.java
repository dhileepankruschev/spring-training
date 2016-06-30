package io.domshom.struts2.ui.radio_checkbox;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RadioCheckboxAction extends ActionSupport{

	private List<String> genders;
	private List<Country> countries;
	
	private String selectedGender;
	private String selectedLanguage;
	private String maritalStatus;
	
	private static final String MALE = "male";
	private static final String FEMALE = "female";
	
	
	
	
	private boolean selectMe;
	private List<String> colors;

	private String yourColor;
	
	
	private List<String> foods;

	private String yourFood;
	
	public RadioCheckboxAction(){
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		
		countries = new ArrayList<Country>();
		countries.add( new Country("JAPAN", "Japanese") );
		countries.add( new Country("CHINA", "Chinese") );
		countries.add( new Country("INDIA", "Hindi") );
		countries.add( new Country("OTHERS", "English") );
		
		colors = new ArrayList<String>();
		colors.add("red");
		colors.add("yellow");
		colors.add("blue");
		colors.add("green");
		
		foods = new ArrayList<String>();
		foods.add("Pasta");
		foods.add("Pizza");
		foods.add("ChowMein");
		foods.add("Others");
	}
	

	public String[] getDefaultColor(){
		return new String [] {"red", "green"};
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

	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public String getSelectedLanguage() {
		return selectedLanguage;
	}

	public void setSelectedLanguage(String selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public static String getMale() {
		return MALE;
	}

	public static String getFemale() {
		return FEMALE;
	}

	public boolean isSelectMe() {
		return selectMe;
	}

	public void setSelectMe(boolean selectMe) {
		this.selectMe = selectMe;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public String getYourColor() {
		return yourColor;
	}

	public void setYourColor(String yourColor) {
		this.yourColor = yourColor;
	}


	public List<String> getFoods() {
		return foods;
	}


	public void setFoods(List<String> foods) {
		this.foods = foods;
	}


	public String getYourFood() {
		return yourFood;
	}


	public void setYourFood(String yourFood) {
		this.yourFood = yourFood;
	}
	
}
