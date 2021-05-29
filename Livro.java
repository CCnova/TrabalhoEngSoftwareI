package br.ufba.trabalho.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private int codigo;
	private String titulo;
	private String editora;
	private List<String> autores;
	private String edicao;
	private int anoDaPublicacao;
	private List<Exemplar> exemplares;

	public Livro(int codigo, String titulo, String editora, List<String> autores, String edicao, int anoDaPublicacao) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anoDaPublicacao = anoDaPublicacao;
		this.exemplares = new ArrayList<Exemplar>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAnoDaPublicacao() {
		return anoDaPublicacao;
	}

	public void setAnoDaPublicacao(int anoDaPublicacao) {
		this.anoDaPublicacao = anoDaPublicacao;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

}
