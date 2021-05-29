package br.ufba.trabalho.biblioteca;

public class AlunoPosGraduacao extends UsuarioAluno {
	int duracaoEmprestimoEmDias = 4;
	int limiteDeEmprestimos = 4;

	public AlunoPosGraduacao(int codigo, String nome) {
		super(codigo, nome);
	}

	@Override
	public void fazerReserva(int codigoLivro) {
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
