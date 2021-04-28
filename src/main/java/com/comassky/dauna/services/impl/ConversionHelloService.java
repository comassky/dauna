package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.dto.NewHelloAssoCsv;
import com.comassky.dauna.services.ConversionHelloServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class ConversionHelloService implements ConversionHelloServiceInterface {

	@Autowired
	private CsvReaderService csvReaderService;


	@Override
	public List<NewHelloAssoCsv> conversionNouveauFormat(List<HelloAssoCsv> fichierEntree) throws IOException {
		final List<NewHelloAssoCsv> fichierSortie = new ArrayList<>();

		fichierEntree.forEach(input -> {
			final int nombreTicket = input.getNombreTicketReel();
			IntStream.range(0, nombreTicket).forEach(ticket -> {
				final NewHelloAssoCsv newHelloAssoCsv = new NewHelloAssoCsv(input);
				newHelloAssoCsv.setNumero(fichierSortie.size()+1);
				fichierSortie.add(newHelloAssoCsv);
			});
		});
		return fichierSortie;
	}
}