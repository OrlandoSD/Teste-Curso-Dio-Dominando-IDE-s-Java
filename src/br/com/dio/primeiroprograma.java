package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Fels", "preto", 5);
		Livros livros = new Livros("O pulo do Gato", "30");
		
		System.out.println(gato);
		System.out.println(livros);


		/* 
		int a= 2;
		int b = 3;
				
		System.out.println("Hello World " + (a+b));*/

	}

}

class Livros{
	private String nome;
	private String npag;
	
	@Override
	public String toString() {
		return "Livros [nome= " + nome + "\n, numero de paginas= " + npag + "]";
}
	public Livros(String nome, String npag) {

		this.nome = nome;
		this.npag = npag;
		
	}
}