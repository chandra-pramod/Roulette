package com.roulette;

public class Bet {
	private String name;
	private NumberType betType;
	private Integer betNumber = 0;
	private Integer amount;
	
	public Bet(String name, NumberType betType, Integer betNumber, Integer amount) {
		this.name = name;
		this.betType = betType;
		this.betNumber = betNumber;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public NumberType getBetType() {
		return betType;
	}
	public Integer getBetNumber() {
		return betNumber;
	}
	public Integer getAmount() {
		return amount;
	}
		
}
