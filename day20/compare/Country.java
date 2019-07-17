package com.training.day20.compare;

import java.util.Comparator;

public class Country {
	
	String countryName;
	String capitalName;
	
	public Country(String countryName, String capitalName) {
		this.countryName = countryName;
		this.capitalName = capitalName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCapitalName(String captialName) {
		this.capitalName = captialName;
	}
	
	public String getCapitalName() {
		return capitalName;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[countryName :" +countryName);
		sb.append(",capitalName :" +capitalName);
		sb.append("]");
		return sb.toString();
	}
	
	public static final Comparator<Country> COUNTRYNAME_COMPARATOR = new Comparator<Country>() {
		
		@Override
		public int compare(Country o1, Country o2) {
			// TODO Auto-generated method stub
			int countryNameDiff = o1.getCountryName().compareTo(o2.getCountryName());
			return countryNameDiff;
		}
		
	};
	
	public static final Comparator<Country> CAPITALNAME_COMPARATOR = new Comparator<Country>() {
		
		@Override
		public int compare(Country o1, Country o2) {
			// TODO Auto-generated method stub
			int capitalNameDiff = o1.getCapitalName().compareTo(o2.getCapitalName());
			return capitalNameDiff;
		}
		
	};
	

}
