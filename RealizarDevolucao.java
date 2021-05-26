package br.ufba.trabalho.biblioteca;

public class RealizarDevolucao implements Comando {

	@Override
	public void executar() {
		BibliotecaFachada.obterInstancia().realizarDevolucao();
	}

}
