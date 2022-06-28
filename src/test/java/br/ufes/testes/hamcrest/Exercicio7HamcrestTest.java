package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercicio7HamcrestTest {

	private ListaNumerosString listaNumerosString;
	private OpenCsvUtil openCsvUtil;
	private List<String> lista;
	private List<Integer> listOfInteger;

	@BeforeEach
	void getListaInteiros() throws IOException {
		var arquivo = getClass().getClassLoader().getResourceAsStream( "lista3.csv" );
		openCsvUtil = new OpenCsvUtil();
		listaNumerosString = openCsvUtil.getListaFromArquivo( arquivo );
		lista = listaNumerosString.getListaNumerosString();
		listOfInteger = convertStringListToIntList( lista, Integer::parseInt );
	}

	@Test
	void exercicio7LetraA() {
		assertThat( listOfInteger, hasSize( 500 ) );

	}

	@Test
	void exercicio7LetraB() {
		assertThat( listOfInteger.get( 0 ), equalTo( 2667 ) );
		assertThat( listOfInteger.get( 1 ), equalTo( 6564 ) );
	}

	@Test
	void exercicio7LetraC() {
		assertThat( listOfInteger, containsInRelativeOrder( 2667, 6564, 898, 2358 ) );
	}

	private <T, U> List<U> convertStringListToIntList( List<T> listOfString, Function<T, U> function ) {
		return listOfString.stream().map( function ).collect( Collectors.toList() );
	}
}
