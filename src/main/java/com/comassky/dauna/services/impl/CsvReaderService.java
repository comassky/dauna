package com.comassky.dauna.services.impl;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.services.CsvReaderServiceInterface;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CsvReaderService implements CsvReaderServiceInterface {

	private static final Logger logger =  LoggerFactory.getLogger(CsvReaderService.class);

	@Override
	public List<HelloAssoCsv> readHelloAssoDtoFromFile() throws IOException {
		Resource resource = new ClassPathResource("export-calandreta-de-la-dauna-01_02_2021-28_02_2021.csv");

		return new CsvToBeanBuilder(new InputStreamReader(resource.getInputStream()))
				.withType(HelloAssoCsv.class)
				.withSeparator(';')
				.build()
				.parse();
	}
}
