package com.roulette;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Roulette {
	
	public List<Bet> bets;
	public List<OutCome> results;
	public Integer rand;
	public NumberType numberType;
	
	public Roulette() {
		this.bets = new ArrayList<>();
		this.results = new ArrayList<>();
		this.rand = 0;
		this.numberType = NumberType.ODD;
	}
	
	public void placeBets(List<Bet> bets) {
		this.bets.addAll(bets);
	}
	public void spin() {
		int min = 1;
		int max = 36;
		Random random = new Random();
	    rand = random.nextInt(max - min) + min;
	    if(rand % 2 == 0) {
	    	this.numberType = NumberType.EVEN;
	    }
	}
	
	public void calculateAmounts() {
		
		for(Bet bet : bets) {
			if(bet.getBetType() == NumberType.EVEN || bet.getBetType() == NumberType.ODD) {
				if(bet.getBetType() == this.numberType) {
					results.add(new OutCome(bet.getName(), "WIN", (bet.getAmount() * 2)));
				}else {
					results.add(new OutCome(bet.getName(), "LOSE", 0));
				}
			}else {
				if(bet.getBetNumber() == rand) {
					results.add(new OutCome(bet.getName(), "WIN", (bet.getAmount() * 36)));
				}else {
					results.add(new OutCome(bet.getName(), "LOSE", 0));
				}
			}
		}
		
	}
	
	

}
