package br.ufba.trabalho.biblioteca;

import java.util.Date;

public class Emprestimo {
	private Livro livro;
	Date data;

	public Emprestimo(Livro livro, Date data) {
		this.livro = livro;
		this.data = data;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
