package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import org.junit.jupiter.api.Test;

class Exercicio2HamcrestTest {

	private Tarefa tarefa = new Tarefa( "Aprendendo a utilizar o Hamcrest" );

	@Test
	void exercicio2LetraA() {
		assertThat( tarefa, hasProperty( "resumo" ) );
	}

	@Test
	void exercicio2LetraB() {
		assertThat( tarefa.getResumo(), equalTo( "Aprendendo a utilizar o Hamcrest" ) );
	}

	@Test
	void exercicio2LetraC() {

		Tarefa novaTarefa = new Tarefa( "Aprendendo a utilizar o Hamcrest" );

		assertThat( tarefa, samePropertyValuesAs( novaTarefa ) );
	}
}
