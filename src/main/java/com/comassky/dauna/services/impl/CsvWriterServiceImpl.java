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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Service
public class CsvWriterServiceImpl implements CsvWriterService {
	@Override
	public void ecrireNouveauFichierListe(final List<NewHelloAssoCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {

		final var file = new File("export-calandreta-compteur.csv");
		Writer writer  = new FileWriter(file);

		StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
				.withSeparator(CSVWriter.DEFAULT_SEPARATOR)
				.build();

		sbc.write(newHelloAssoCsvList);
		writer.close();
	}

	@Override
	public void ecrireNouveauFichierListeGagnant(List<HelloAssoWinnerCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
		final var file = new File("export-calandreta-gagnant.csv");
		Writer writer  = new FileWriter(file);

		StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
				.withSeparator(CSVWriter.DEFAULT_SEPARATOR)
				.build();

		sbc.write(newHelloAssoCsvList);
		writer.close();
	}
}
