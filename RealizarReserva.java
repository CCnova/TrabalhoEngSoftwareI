package br.ufba.trabalho.biblioteca;

public class RealizarReserva implements Comando {

	@Override
	public void executar(int codigoLivro, int codigoInutil) {
		BibliotecaFachada.obterInstancia().realizarReserva();
	}

}
