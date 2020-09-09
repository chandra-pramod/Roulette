package com.roulette;

public class OutCome {
	private String name;
	private String status;
	private Integer amount;
	
	
	public OutCome(String name, String status, Integer amount) {
		this.name = name;
		this.status = status;
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
}
