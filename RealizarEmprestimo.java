package br.ufba.trabalho.biblioteca;

public class RealizarEmprestimo implements Comando {

	@Override
	public void executar(int codigoUsuario, int codigoLivro) {
		
		BibliotecaFachada.obterInstancia().realizarEmprestimo(codigoUsuario, codigoLivro);
	}

}
