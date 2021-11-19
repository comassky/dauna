package com.comassky.dauna.services;


import com.comassky.dauna.dto.NewHelloAssoCsv;

import java.util.List;

public interface RandomGeneratorInterface {

	NewHelloAssoCsv recupererNumeroGagnant(final List<NewHelloAssoCsv> tickets, final Boolean remove);

	List<NewHelloAssoCsv> melangerListe(final Integer nombreTourMelange, final List<NewHelloAssoCsv> listeTickets);
}
