package br.ufba.trabalho.biblioteca;

public class Reserva {
	private Livro livro;

	public Reserva(Livro livro) {
		this.livro = livro;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
