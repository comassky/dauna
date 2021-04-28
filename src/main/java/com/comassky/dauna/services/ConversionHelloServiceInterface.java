package com.comassky.dauna.services;

import com.comassky.dauna.dto.HelloAssoCsv;
import com.comassky.dauna.dto.NewHelloAssoCsv;

import java.io.IOException;
import java.util.List;

public interface ConversionHelloServiceInterface {
	List<NewHelloAssoCsv> conversionNouveauFormat(final List<HelloAssoCsv> helloAssoCsvs) throws IOException;
}
