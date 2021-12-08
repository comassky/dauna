package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.HelloAssoWinnerCsv;
import com.comassky.dauna.dto.NewHelloAssoCsv;
import com.comassky.dauna.services.CsvWriterService;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class CsvWriterServiceImpl implements CsvWriterService {
	@Override
	public void ecrireNouveauFichierListe(final List<NewHelloAssoCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {

		final var file = new File("export-calandreta-compteur.csv");
		final var os = new FileOutputStream(file);
		final var csvWrite = new CSVWriter(new OutputStreamWriter(os, StandardCharsets.ISO_8859_1));

		StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(csvWrite)
				.withSeparator(CSVWriter.DEFAULT_SEPARATOR)
				.build();

		sbc.write(newHelloAssoCsvList);
		csvWrite.close();
	}

	@Override
	public void ecrireNouveauFichierListeGagnant(List<HelloAssoWinnerCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
		final var file = new File("export-calandreta-gagnant.csv");


		final var os = new FileOutputStream(file);
		final var csvWrite = new CSVWriter(new OutputStreamWriter(os, StandardCharsets.ISO_8859_1));

		StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(csvWrite)
				.withSeparator(CSVWriter.DEFAULT_SEPARATOR)
				.build();

		sbc.write(newHelloAssoCsvList);
		csvWrite.close();
	}
}
