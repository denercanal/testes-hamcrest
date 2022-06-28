package br.ufes.testes.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Exercicio6HamcrestTest {

	private ArrayList<Integer> lista;

	@Test
	void exercicio6() {
		lista = new ArrayList<Integer>();
		assertThat( lista, empty() );
	}
}
