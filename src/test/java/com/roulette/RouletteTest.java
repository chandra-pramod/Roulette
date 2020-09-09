package com.roulette;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RouletteTest {

	
	@Test
	public void testRolette() {
		List<Bet> bets = new ArrayList<>();
		bets.add(new Bet("Tiki_Monkey", NumberType.OTHER, 2, 1));
		bets.add(new Bet("Barbara", NumberType.EVEN, 0, 3));
		Roulette roulette = new Roulette();
		roulette.placeBets(bets);
		roulette.spin();
		roulette.calculateAmounts();
		StringBuilder builder = new StringBuilder();
		builder.append("Player   ").append("Bet   ").append("Outcome    ").append("Winnings").append("\n").append("-----").append("\n");
		for(OutCome outCome : roulette.results) {
			builder.append(outCome.getName()+"   ").append(outCome.getStatus()+"  ").append(outCome.getAmount()+"  ").append("\n");
		}
		System.out.println(builder.toString());
		assertEquals(2, roulette.results.size());
	}
}
