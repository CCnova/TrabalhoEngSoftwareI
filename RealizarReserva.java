package br.ufba.trabalho.biblioteca;

public class RealizarReserva implements Comando {

	@Override
	public void executar(int codigoUsuario, int codigoLivro) {
		BibliotecaFachada.obterInstancia().realizarReserva(codigoUsuario, codigoLivro);
	}

	@Override
	public void executar(int codigo1) {
		// TODO Auto-generated method stub

	}

}
