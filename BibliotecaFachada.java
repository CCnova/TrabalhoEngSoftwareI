package br.ufba.trabalho.biblioteca;

public class BibliotecaFachada {
	private static BibliotecaFachada instancia;

	private BibliotecaFachada() {
	}

	public static BibliotecaFachada obterInstancia() {
		if (instancia == null) {
			instancia = new BibliotecaFachada();
		}
		return instancia;
	}

	public void realizarEmprestimo(int codigoUsuario, int codigoLivro) {
		System.out.println("Iniciando procedimento de emprestimo");

		Usuario usuario = BaseDeDados.obterInstancia().getUsuarioPorCodigo(codigoUsuario);
//		Livro livro = BaseDeDados.obterInstancia().getLivroPorCodigo(codigoLivro);

//		if (livroReservado.getCodigo() != codigoLivro) {
//			System.out.println("Este livro não está reservado para você.");
//		} else {
//			System.out.println("Este livro foi reservado por você");
//		}
		if (usuario != null) {
			usuario.fazerEmprestimo(codigoLivro);
			return;
		}

	}

	public void realizarDevolucao(int codigoLivro, int codigoInutil) {
		System.out.println("Iniciando procedimento de devolucao...");
	}

	public void realizarReserva(int codigoLivro, int codigoInutil) {
		System.out.println("Iniciando procedimento de reserva...");
	}
	
	public void realizarObservacao(int codigoLivro, int codigoInutil) {
		System.out.println("Iniciando procedimento de observação...");
	}
	
	public void realizarConsultaLivro(int codigoLivro, int codigoInutil) {
		System.out.println("Iniciando consulta de dados do livro...");
	}
	
	public void realizarConsultaUsuario(int codigoUsuario, int codigoInutil) {
		System.out.println("Iniciando consulta de dados do usuário...");
	}

	public void realizarConsultaProfessor(int codigoUsuario, int codigoInutil) {
		System.out.println("Iniciando consulta de notificações do professor...");
	}

}
