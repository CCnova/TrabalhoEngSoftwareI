package br.ufba.trabalho.biblioteca;

public class RealizarObservacao implements Comando {

	@Override
	public void executar(int codigoLivro, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarObservacao(codigoLivro, codigoInutil);
	}

}
