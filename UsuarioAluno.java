package br.ufba.trabalho.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class UsuarioAluno extends Usuario {
	private List<Reserva> reservas;
	private int limiteDeEmprestimos;
	BaseDeDados dados = BaseDeDados.obterInstancia();

	public UsuarioAluno(int codigo, String nome) {
		super(codigo, nome);
		reservas = new ArrayList<Reserva>();
	}

	void fazerReserva(int codigoLivro) {
		Livro livro = BaseDeDados.obterInstancia().getLivroPorCodigo(codigoLivro);
		reservas.add(new Reserva(livro));
	}

	void fazerEmprestimo(int codigoLivro) {
		if (!possoFazerEmprestimo(codigoLivro)) {
			System.out.println("Seu empr�stimo falhou.");
			return;
		}

		Emprestimo emprestimo = new Emprestimo(dados.getLivroPorCodigo(codigoLivro), new Date());
		dados.getUsuarioPorCodigo(this.getCodigo()).getEmprestimos().add(emprestimo);
		System.out.println("Livro: " + dados.getLivroPorCodigo(codigoLivro).getTitulo() + ". Emprestado com sucesso!");

	}

	@Override
	boolean possoFazerEmprestimo(int codigoLivro) {

		if (!dados.existeExemplarDoLivro(codigoLivro)) {
			System.out.println("N�o h� exemplares deste livro na biblioteca.");
			return false;
		}

		if (!dados.existeExemplarDisponivel(codigoLivro)) {
			System.out.println("N�o h� exemplares deste livro dispon�veis no momento");
			return false;
		}

		if (dados.checarUsuarioDevedor(this.getCodigo())) {
			System.out.println("O usu�rio n�o pode fazer empr�stimo pois est� devendo livro em atraso");
			return false;
		}

		if (this.getLimiteDeEmprestimos() <= this.getEmprestimos().size()) {
			System.out
					.println("O usu�rio n�o pode fazer empr�stimo pois atingiu o limite de empr�stimos. Seu limite �: "
							+ this.getLimiteDeEmprestimos());
			return false;
		}

		for (Emprestimo emprestimo : this.getEmprestimos()) {
			if (emprestimo.getLivro().getCodigo() == codigoLivro) {
				System.out.println("O usu�rio n�o pode fazer empr�stimo pois j� possui um empr�stimo deste livro");
				return false;
			}
		}

		return true;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public int getLimiteDeEmprestimos() {
		return limiteDeEmprestimos;
	}

	public void setLimiteDeEmprestimos(int limiteDeEmprestimos) {
		this.limiteDeEmprestimos = limiteDeEmprestimos;
	}

	
	
}
