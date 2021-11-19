package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.NewHelloAssoCsv;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootTest
class RandomGeneratorServiceTest {

	@Autowired
	private RandomGeneratorService randomGeneratorService;

	private Map<String, Integer> users;
	private static Integer NOMBRE_TOUR_TIRAGE = 100000;
	private static Integer NOMBRE_PERSONNES = 200;
	private static Integer NOMBRE_TICKET_POSSIBLE = 5;

	@Test
	public void testRandom() {

		this.users = new HashMap<String, Integer>();

		final var listTickets = IntStream.range(1, NOMBRE_PERSONNES).mapToObj(this::createDto).flatMap(Collection::stream).collect(Collectors.toList());
		final var mapWinner = new HashMap<String, Integer>();


		IntStream.range(0, NOMBRE_TOUR_TIRAGE).forEach(index -> {
			//On mélange
			final var ticketRandom = this.randomGeneratorService.melangerListe(100, listTickets);
			final var winner = this.randomGeneratorService.recupererNumeroGagnant(ticketRandom, false);
			var element = Optional.ofNullable(mapWinner.get(winner.getNom()));
			if(element.isPresent()) {
				mapWinner.put(winner.getNom(), mapWinner.get(winner.getNom()) + 1);
			} else {
				mapWinner.put(winner.getNom(), 1);
			}
		});

		this.calculerScore(mapWinner);
		System.out.println("Nombre ticket total = " + listTickets.size());
	}


	private List<NewHelloAssoCsv> createDto(final int index){
		final var helloAsso = new ArrayList<NewHelloAssoCsv>();
		final var tickets = IntStream.range(0, randomNumber(NOMBRE_TICKET_POSSIBLE)).mapToObj(i -> {
			final var helloAssoUniq = new NewHelloAssoCsv();
			helloAssoUniq.setNumero(index);
			helloAssoUniq.setNom("Test_"+index);
			return helloAssoUniq;
		}).collect(Collectors.toList());

		this.users.put("Test_" + index, tickets.size());
		return tickets;
	}

	private int randomNumber(final int max){
		return new SecureRandom().nextInt(max) + 1;
	}

	private void calculerScore(HashMap<String, Integer> mapWinner) {

		final var nombreTicket = this.users.values().stream().mapToInt(i -> i).sum();

		users.forEach((key, value) -> {
			final var pourcentageTicket = ((float) (value * 100)) / nombreTicket;
			final var pourcentageWin = ((float) (Optional.ofNullable(mapWinner.get(key)).orElseGet(() ->0) * 100)) / NOMBRE_TOUR_TIRAGE;

			System.out.println("User :" + key + ", ticket ("+ value +"/" + nombreTicket +") = " + String.format("%2.02f", pourcentageTicket) + "%, ("  +  Optional.ofNullable(mapWinner.get(key)).orElseGet(() ->0) + "/" + NOMBRE_TOUR_TIRAGE + ") win = "  + String.format("%2.02f", pourcentageWin) + "%");
		});
	}
}