package br.ufba.trabalho.biblioteca;

public class RealizarReserva implements Comando {

	@Override
	public void executar() {
		BibliotecaFachada.obterInstancia().realizarReserva();
	}

}
