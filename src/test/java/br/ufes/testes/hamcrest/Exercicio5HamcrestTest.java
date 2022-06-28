package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercicio5HamcrestTest {

	private List<String> listaAnimais;

	@BeforeEach
	public void criaListaAnimais() {
		listaAnimais = new ArrayList<String>();
		listaAnimais.add( "Cachorros" );
		listaAnimais.add( "Gatos" );
		listaAnimais.add( "Peixes" );
		listaAnimais.add( "Vacas" );
	}

	@Test
	void exercicio5LetraA() {
		assertThat( listaAnimais, hasSize( 4 ) );
	}

	@Test
	void exercicio5LetraB() {
		assertThat( listaAnimais, containsInAnyOrder( "Cachorros", "Gatos", "Vacas", "Peixes" ) );
	}

	@Test
	void exercicio5LetraC() {
		assertThat( listaAnimais, contains( "Cachorros", "Gatos", "Peixes", "Vacas" ) );
	}

	@Test
	void exercicio5LetraD() {
		assertThat( listaAnimais, hasItem( "Peixes" ) );
	}

	@Test
	void exercicio5LetraE() {
		assertThat( listaAnimais, hasItems( "Gatos", "Peixes" ) );
	}

	@Test
	void exercicio5LetraF() {
		assertThat( listaAnimais, not( empty() ) );
	}

	@Test
	void exercicio5LetraG() {
		assertThat( listaAnimais, everyItem( endsWith( "s" ) ) );
	}
}
