package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.services.CsvReaderServiceInterface;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

@Service
public class CsvReaderService implements CsvReaderServiceInterface {

	@Value("${fichier.hello.asso}")
	private String helloAssoFile;

	private static final Logger logger =  LoggerFactory.getLogger(CsvReaderService.class);

	@Override
	public List<HelloAssoCsv> readHelloAssoDtoFromFile() throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File("./fichier/"+helloAssoFile);

		return new CsvToBeanBuilder(new InputStreamReader(new FileInputStream(file)))
				.withType(HelloAssoCsv.class)
				.withSeparator(';')
				.build()
				.parse();
	}
}
