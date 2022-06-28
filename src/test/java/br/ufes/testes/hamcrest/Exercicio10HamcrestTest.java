package br.ufes.testes.hamcrest;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Exercicio10HamcrestTest {

	@Test
	void exercicio10LetraA() {
		Double valor = 10.10;
		assertThat( valor, is( closeTo( 10.0, 0.1 ) ) );
	}

	@Test
	void exercicio10LetraB() {
		Double valor = 10.10;
		assertThat( valor, is( greaterThan( 10.00 ) ) );
	}

	@Test
	void exercicio10LetraC() {
		var listaInteiros = new ArrayList<Integer>();
		listaInteiros.add( 1000 );
		listaInteiros.add( 2000 );
		assertThat( listaInteiros, everyItem( greaterThan( 500 ) ) );
	}

	@Test
	void exercicio10LetraD() {
		var listaInteiros = new ArrayList<Integer>();
		listaInteiros.add( 1000 );
		listaInteiros.add( 2000 );
		assertThat( listaInteiros, everyItem( greaterThanOrEqualTo( 1000 ) ) );
	}

	@Test
	void exercicio10LetraE() {
		var listaInteiros = new ArrayList<Integer>();
		listaInteiros.add( 1000 );
		listaInteiros.add( 2000 );
		assertThat( listaInteiros, everyItem( lessThan( 3000 ) ) );
	}

	@Test
	void exercicio10LetraF() {
		var listaInteiros = new ArrayList<Integer>();
		listaInteiros.add( 1000 );
		listaInteiros.add( 2000 );
		assertThat( listaInteiros, everyItem( lessThanOrEqualTo( 2000 ) ) );
	}
}
