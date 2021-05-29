package br.ufba.trabalho.biblioteca;

public class RealizarConsultaUsuario implements Comando {

	public void executar(int codigoUsuario, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarConsultaUsuario(codigoUsuario, codigoInutil);
	}

}
