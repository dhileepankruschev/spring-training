package io.domshom.struts2.ui.combo;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ComboboxAction extends ActionSupport{

	private List<String> countries;

	private String yourCountry;
	private String today;
	
	public ComboboxAction(){
		
		countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Japan");
		countries.add("South Africa");
		countries.add("Nepal");
		countries.add("Other");
	}

	public String execute() {
		return SUCCESS;
	}
	
	public String display() {
		return NONE;
	}

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public String getYourCountry() {
		return yourCountry;
	}

	public void setYourCountry(String yourCountry) {
		this.yourCountry = yourCountry;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}
	
	
}