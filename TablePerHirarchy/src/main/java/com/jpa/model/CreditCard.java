package com.jpa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MyCreditCard")
@DiscriminatorValue(value="")
public class CreditCard extends Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3042812038600311521L;
	
	@Column(name="CCT")
	private String creditCardType;
	
	@Column(name="CARD_NUMBER")
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Card No. " + number + ", Credit Card Type : " + creditCardType;
}
}
