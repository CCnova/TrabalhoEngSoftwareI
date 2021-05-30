package br.ufba.trabalho.biblioteca;

public class AlunoGraduacao extends UsuarioAluno {
	int duracaoEmprestimoEmDias = 3;
	int limiteDeEmprestimos = 3;

	public AlunoGraduacao(int codigo, String nome) {
		super(codigo, nome);
	}

	@Override
	public int getLimiteDeEmprestimos() {
		return this.limiteDeEmprestimos;
	}

	@Override
	public int getDuracaoEmprestimoEmDias() {
		return this.limiteDeEmprestimos;
	}
}
