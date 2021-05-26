package br.ufba.trabalho.biblioteca;

public class RealizarConsultaLivro implements Comando {

	public void executar() {
		BibliotecaFachada.obterInstancia().realizarConsultaLivro();
	}

}
