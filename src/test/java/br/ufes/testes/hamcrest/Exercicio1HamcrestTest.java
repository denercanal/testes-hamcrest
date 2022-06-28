package br.ufes.testes.hamcrest;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.number.OrderingComparison.greaterThan;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName( "Exercicio - 1 Lista Hamcrest Test" )
class Exercicio1HamcrestTest {

	private ListaNumerosString listaNumerosString;
	private OpenCsvUtil openCsvUtil;
	private List<String> lista;

	@BeforeEach
	public void getListaInteiros() throws IOException {
		var arquivo = getClass().getClassLoader().getResourceAsStream( "lista.csv" );
		openCsvUtil = new OpenCsvUtil();
		listaNumerosString = openCsvUtil.getListaFromArquivo( arquivo );
		lista = listaNumerosString.getListaNumerosString();
	}

	@Test
	@DisplayName( "letra a: tem tamanho 500" )
	void exercicio1LetraA() {
		assertThat( lista, hasSize( 500 ) );
	}

	@Test
	@DisplayName( "letra b: contém os elementos 5140, 9748 e, 3414 em qualquer ordem" )
	void exercicio1LetraB() {
		assertThat( lista, hasItems( "5140", "9748", "3414" ) );

	}

	@Test
	@DisplayName( "letra c: Item, na ordem apresentada" )
	void exercicio1LetraC() {
		assertThat( lista, containsInRelativeOrder( "5140", "9748", "3414" ) );
	}

	@Test
	@DisplayName( "letra d: cada item é maior que 350" )
	void exercicio1LetraD() {
		List<Integer> listOfInteger = convertStringListToIntList( lista, Integer::parseInt );
		assertThat( listOfInteger, everyItem( greaterThan( 350 ) ) );
	}

	private <T, U> List<U> convertStringListToIntList( List<T> listOfString, Function<T, U> function ) {
		return listOfString.stream().map( function ).collect( Collectors.toList() );
	}

}
