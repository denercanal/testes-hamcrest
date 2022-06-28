package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.hasValue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercicio8HamcrestTest {

	private Map<String, String> mapa;

	@BeforeEach
	public void getMapa() {
		mapa = new HashMap<String, String>();
		mapa.put( "a", "Cachorros" );
		mapa.put( "b", "Gatos" );
		mapa.put( "c", "Peixes" );
		mapa.put( "d", "Vacas" );
	}

	@Test
	void exercicio8LetraA() {
		assertThat( mapa, hasEntry( "a", "Cachorros" ) );
	}

	@Test
	void exercicio8LetraB() {
		assertThat( mapa, hasKey( "b" ) );
	}

	@Test
	void exercicio8LetraC() {
		assertThat( mapa, hasValue( "Peixes" ) );
	}

	@Test
	void exercicio8LetraD() {
		assertThat( mapa, both( hasKey( "a" ) ).and( hasValue( "Vacas" ) ) );
	}
}
