package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.NewHelloAssoCsv;
import com.comassky.dauna.services.RandomGeneratorInterface;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class RandomGeneratorService implements RandomGeneratorInterface {

	private int randomNumber(final int max){
		return new SecureRandom().nextInt(max - 0);
	}
	@Override
	public NewHelloAssoCsv recupererNumeroGagnant(List<NewHelloAssoCsv> tickets) {
		final var randomNumber = randomNumber(tickets.size());
		final var winner =  tickets.get(randomNumber);
		tickets.remove(randomNumber);
		return winner;
	}

	@Override
	public List<NewHelloAssoCsv> melangerListe(Integer nombreTourMelange, List<NewHelloAssoCsv> listeTickets) {
		IntStream.range(0, nombreTourMelange).forEach(i -> {
			Collections.shuffle(listeTickets);
		});
		return listeTickets;
	}
}
