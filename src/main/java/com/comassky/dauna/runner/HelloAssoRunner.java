package com.comassky.dauna.runner;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.services.impl.ConversionHelloService;
import com.comassky.dauna.services.impl.CsvReaderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Order(1)
class HelloAssoRunner implements CommandLineRunner {

	@Autowired
	private CsvReaderService csvReader;

	@Autowired
	private ConversionHelloService conversionService;

	private static final Logger logger =  LoggerFactory.getLogger(HelloAssoRunner.class);

	@Override
	public void run(String... args) throws Exception {
		final List<HelloAssoCsv> fichierEntree = this.csvReader.readHelloAssoDtoFromFile();
		this.conversionService.conversionNouveauFormat(fichierEntree);
	}

}
