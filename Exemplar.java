package br.ufba.trabalho.biblioteca;

public class Exemplar {
	private int codigoExemplar;
	private int codigoLivro;
	private String status;

	public Exemplar(int codigoLivro, int codigoExemplar, String status) {
		super();
		this.codigoLivro = codigoLivro;
		this.codigoExemplar = codigoExemplar;
		this.status = status;
	}

	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public int getCodigoExemplar() {
		return codigoExemplar;
	}

	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
