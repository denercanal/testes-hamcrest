package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercicio4HamcrestTest {

	private ListaNumerosString listaNumerosString;
	private OpenCsvUtil openCsvUtil;
	private List<String> lista;

	@BeforeEach
	void getListaInteiros() throws IOException {
		var arquivo = getClass().getClassLoader().getResourceAsStream( "lista2.csv" );
		openCsvUtil = new OpenCsvUtil();
		listaNumerosString = openCsvUtil.getListaFromArquivo( arquivo );
		lista = listaNumerosString.getListaNumerosString();
	}

	@Test
	void exercicio4LetraA() {
		assertThat( lista, hasSize( 500 ) );

	}

	@Test
	void exercicio4LetraB() {
		assertThat( lista.get( 0 ), equalTo( "2667" ) );
		assertThat( lista.get( 1 ), equalTo( "6564" ) );
	}

	@Test
	void exercicio4LetraC() {
		assertThat( lista, containsInRelativeOrder( "2667", "6564", "898", "2358" ) );
	}

}
