package com.learn.springcore2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Card {

	@Value("111")
	private int cardNo;
	
	@Value("prime")
	private String type;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int cardNo, String type) {
		super();
		this.cardNo = cardNo;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", type=" + type + "]";
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
