package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCurso {
	public static void main(String[] args) {
		
		Cursos javaColecoes = new Cursos("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		
		System.out.println(aulas);

	}
}
