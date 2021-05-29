package br.ufba.trabalho.biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
	private int codigo;
	private String nome;
	private List<Emprestimo> emprestimos;
	private int duracaoEmprestimoEmDias;
	private boolean isDevedor;

	public Usuario(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		emprestimos = new ArrayList<Emprestimo>();
	}

	void fazerEmprestimo(int codigoLivro) {

	}

	boolean possoFazerEmprestimo(int codigoLivro) {
		return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public boolean isDevedor() {
		return isDevedor;
	}

	public void setDevedor(boolean isDevedor) {
		this.isDevedor = isDevedor;
	}

	public int getDuracaoEmprestimoEmDias() {
		return duracaoEmprestimoEmDias;
	}

	public void setDuracaoEmprestimoEmDias(int duracaoEmprestimoEmDias) {
		this.duracaoEmprestimoEmDias = duracaoEmprestimoEmDias;
	}

}
