package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import org.junit.jupiter.api.Test;

class Exercicio3HamcrestTest {

	private Caminhao caminhao = new Caminhao( "Caminhao semi", "Tesla", 2020 );

	@Test
	void exercicio3LetraA() {
		assertThat( caminhao, hasProperty( "modelo" ) );
	}

	@Test
	void exercicio3LetraB() {
		assertThat( caminhao, hasProperty( "modelo" ) );
		assertThat( caminhao.getModelo(), equalTo( "Caminhao semi" ) );
	}

	@Test
	void exercicio3LetraC() {
		assertThat( caminhao, hasProperty( "fabricante" ) );
		assertThat( caminhao.getFabricante(), equalTo( "Tesla" ) );
	}

	@Test
	void exercicio3LetraD() {
		var novoCaminhao = new Caminhao( "Caminhao semi", "Tesla", 2020 );
		assertThat( caminhao, samePropertyValuesAs( novoCaminhao ) );
	}

	@Test
	void exercicio3LetraE() {
		String esperado = "Caminhao{modelo:Caminhao semi, ano:2020, fabricanteTesla";
		assertThat( caminhao, hasToString( esperado ) );
	}
}
