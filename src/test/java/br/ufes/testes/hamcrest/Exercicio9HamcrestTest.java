package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Exercicio9HamcrestTest {

	@Test
	void exercicio9LetraA() {
		var list = new ArrayList<>();
		list.add( 3 );
		assertThat( list, is( not( empty() ) ) );
	}

	@Test
	void exercicio9LetraB() {
		var list = new ArrayList<>();
		list.add( 3 );
		assertThat( list.get( 0 ), equalTo( 3 ) );
		assertThat( list, hasSize( 1 ) );
		assertThat( list, is( not( empty() ) ) );
	}

	@Test
	void exercicio9LetraC() {
		assertThat( "Cachorros, Gatos, Peixes, Vacas", not( containsString( "Lobos" ) ) );
	}

	@Test
	void exercicio9LetraD() {
		assertThat( "Cachorros, Gatos, Peixes, Vacas", containsString( "Cachorros" ) );
	}

	@Test
	void exercicio9LetraE() {
		assertThat( "Cachorros, Gatos, Peixes, Vacas", equalTo( "Cachorros, Gatos, Peixes, Vacas" ) );
	}

	@Test
	void exercicio9LetraF() {
		assertThat( "Cachorros, Gatos, Peixes, Vacas", startsWith( "Cachorros, Gatos," ) );
	}

	@Test
	void exercicio9LetraG() {
		var tarefa = new Tarefa();
		assertThat( tarefa, notNullValue() );
	}

	@Test
	void exercicio9LetraH() {
		Tarefa tarefa = null;
		assertThat( tarefa, nullValue() );
	}

	@Test
	void exercicio9LetraI() {
		var tarefa = new Tarefa();
		var novaTarefa = new Tarefa();
		assertThat( novaTarefa, instanceOf( tarefa.getClass() ) );
	}
}
