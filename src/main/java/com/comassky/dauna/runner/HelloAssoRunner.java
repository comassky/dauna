package com.comassky.dauna.runner;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.services.RandomGeneratorInterface;
import com.comassky.dauna.services.impl.ConversionHelloService;
import com.comassky.dauna.services.impl.CsvReaderService;
import com.comassky.dauna.services.impl.RandomGeneratorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.IntStream;


@Component
@Order(1)
class HelloAssoRunner implements CommandLineRunner {

	@Autowired
	private CsvReaderService csvReader;

	@Autowired
	private ConversionHelloService conversionService;

	@Autowired
	private RandomGeneratorService randomGeneratorService;

	private static final Logger logger =  LoggerFactory.getLogger(HelloAssoRunner.class);

	@Override
	public void run(String... args) throws Exception {
		final List<HelloAssoCsv> fichierEntree = this.csvReader.readHelloAssoDtoFromFile();
		final var listeTickets = this.conversionService.conversionNouveauFormat(fichierEntree);

		//On mélange
		IntStream.range(0,50).forEach(i -> {
			final var melange = this.randomGeneratorService.melangerListe(100, listeTickets);
			final var winner = this.randomGeneratorService.recupererNumeroGagnant(listeTickets);
			System.out.println("********************************************************");
			System.out.println("Gagnant " + i +" = " + winner.toString());
		});



	}

}
