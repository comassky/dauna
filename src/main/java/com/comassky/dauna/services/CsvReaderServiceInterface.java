package com.comassky.dauna.services;

import com.comassky.dauna.dto.HelloAssoCsv;

import java.io.IOException;
import java.util.List;

public interface CsvReaderServiceInterface {

	List<HelloAssoCsv> readHelloAssoDtoFromFile() throws IOException;
}
