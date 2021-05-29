package br.ufba.trabalho.biblioteca;

public class RealizarConsultaLivro implements Comando {

	public void executar(int codigoLivro, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarConsultaLivro(codigoLivro, codigoInutil);
	}

}
