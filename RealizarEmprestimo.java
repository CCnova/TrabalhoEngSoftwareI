package br.ufba.trabalho.biblioteca;

public class RealizarEmprestimo implements Comando {

	@Override
	public void executar() {
		BibliotecaFachada.obterInstancia().realizarEmprestimo();
	}

}
