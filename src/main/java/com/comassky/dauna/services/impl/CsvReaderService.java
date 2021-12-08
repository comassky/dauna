package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.services.CsvReaderServiceInterface;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.io.input.BOMInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

		//Resource resource = new ClassPathResource("hello.csv");

		return new CsvToBeanBuilder(new InputStreamReader(new BOMInputStream(new FileInputStream(file)),  StandardCharsets.UTF_8))
				.withType(HelloAssoCsv.class)
				.withSeparator(';')
				.build()
				.parse();


		/*return new CsvToBeanBuilder(new InputStreamReader(new BOMInputStream(resource.getInputStream()),  StandardCharsets.UTF_8))
				.withType(HelloAssoCsv.class)
				.withSeparator(';')
				.build()
				.parse();*/
	}
}
