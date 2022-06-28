package br.ufes.testes.hamcrest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class OpenCsvUtil {

	public ListaNumerosString getListaFromArquivo( InputStream arquivo ) throws IOException {
		Reader reader = new InputStreamReader( arquivo );
		CSVReader csvReader = new CSVReaderBuilder( reader ).build();

		List<String[]> items = csvReader.readAll();
		var listaInteiros = new ListaNumerosString();
		listaInteiros.setListaNumerosString( new ArrayList<String>() );
		for( var item : items ) {
			listaInteiros.getListaNumerosString().add( item[0] );
		}
		return listaInteiros;
	}

}
