package com.comassky.dauna.services;

import com.comassky.dauna.dto.HelloAssoWinnerCsv;
import com.comassky.dauna.dto.NewHelloAssoCsv;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.List;


public interface CsvWriterService {
	void ecrireNouveauFichierListe(final List<NewHelloAssoCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException;
	void ecrireNouveauFichierListeGagnant(final List<HelloAssoWinnerCsv> newHelloAssoCsvList) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException;
}
