package br.ufba.trabalho.biblioteca;

public class RealizarDevolucao implements Comando {

	@Override
	public void executar(int codigoLivro, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarDevolucao();
	}

}
