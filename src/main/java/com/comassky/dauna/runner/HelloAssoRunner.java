package com.comassky.dauna.runner;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.dto.HelloAssoWinnerCsv;
import com.comassky.dauna.dto.NewHelloAssoCsv;
import com.comassky.dauna.services.CsvWriterService;
import com.comassky.dauna.services.impl.ConversionHelloService;
import com.comassky.dauna.services.impl.CsvReaderService;
import com.comassky.dauna.services.impl.RandomGeneratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


@Component
@Order(1)
class HelloAssoRunner implements CommandLineRunner {

	@Value("${nombreLot}")
	private int nombreLot;

	@Autowired
	private CsvReaderService csvReader;

	@Autowired
	private CsvWriterService csvWriterService;

	@Autowired
	private ConversionHelloService conversionService;

	@Autowired
	private RandomGeneratorService randomGeneratorService;

	private static final Logger logger =  LoggerFactory.getLogger(HelloAssoRunner.class);

	@Override
	public void run(String... args) throws Exception {
		final List<HelloAssoCsv> fichierEntree = this.csvReader.readHelloAssoDtoFromFile();
		final var listeTickets = this.conversionService.conversionNouveauFormat(fichierEntree);

		//On génère la liste avec l'ordre
		this.csvWriterService.ecrireNouveauFichierListe(listeTickets);

		//On mélange
		final List<HelloAssoWinnerCsv> listeGagnant = new ArrayList<>();
		IntStream.range(0,nombreLot).forEach(i -> {
			final var melange = this.randomGeneratorService.melangerListe(500, listeTickets);
			final var winner = this.randomGeneratorService.recupererNumeroGagnant(listeTickets, true);
			final var winnerCSV = new HelloAssoWinnerCsv(winner);
			winnerCSV.setLot("Lot : " + (i + 1));
			listeGagnant.add(winnerCSV);
		});

		this.csvWriterService.ecrireNouveauFichierListeGagnant(listeGagnant);
	}

}
