package com.air.entity;

public class FlightData {
	
	private String min_business_miles;
	private String min_business_tax;
	private String min_economy_miles;
	private String min_economy_tax;
	private String min_first_miles;
	private String min_first_tax;
	private String partner_program;
	public FlightData() {
		super();
	}
	@Override
	public String toString() {
		return "FlightData [min_business_miles=" + min_business_miles + ", min_business_tax=" + min_business_tax
				+ ", min_economy_miles=" + min_economy_miles + ", min_economy_tax=" + min_economy_tax
				+ ", min_first_miles=" + min_first_miles + ", min_first_tax=" + min_first_tax + ", partner_program="
				+ partner_program + "]";
	}
	public FlightData(String min_business_miles, String min_business_tax, String min_economy_miles,
			String min_economy_tax, String min_first_miles, String min_first_tax, String partner_program) {
		super();
		this.min_business_miles = min_business_miles;
		this.min_business_tax = min_business_tax;
		this.min_economy_miles = min_economy_miles;
		this.min_economy_tax = min_economy_tax;
		this.min_first_miles = min_first_miles;
		this.min_first_tax = min_first_tax;
		this.partner_program = partner_program;
	}
	public String getMin_business_miles() {
		return min_business_miles;
	}
	public void setMin_business_miles(String min_business_miles) {
		this.min_business_miles = min_business_miles;
	}
	public String getMin_business_tax() {
		return min_business_tax;
	}
	public void setMin_business_tax(String min_business_tax) {
		this.min_business_tax = min_business_tax;
	}
	public String getMin_economy_miles() {
		return min_economy_miles;
	}
	public void setMin_economy_miles(String min_economy_miles) {
		this.min_economy_miles = min_economy_miles;
	}
	public String getMin_economy_tax() {
		return min_economy_tax;
	}
	public void setMin_economy_tax(String min_economy_tax) {
		this.min_economy_tax = min_economy_tax;
	}
	public String getMin_first_miles() {
		return min_first_miles;
	}
	public void setMin_first_miles(String min_first_miles) {
		this.min_first_miles = min_first_miles;
	}
	public String getMin_first_tax() {
		return min_first_tax;
	}
	public void setMin_first_tax(String min_first_tax) {
		this.min_first_tax = min_first_tax;
	}
	public String getPartner_program() {
		return partner_program;
	}
	public void setPartner_program(String partner_program) {
		this.partner_program = partner_program;
	}
}