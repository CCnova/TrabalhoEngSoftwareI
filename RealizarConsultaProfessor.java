package br.ufba.trabalho.biblioteca;

public class RealizarConsultaProfessor implements Comando {

	public void executar(int codigoUsuario, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarConsultaProfessor(codigoUsuario, codigoInutil);
	}

}
