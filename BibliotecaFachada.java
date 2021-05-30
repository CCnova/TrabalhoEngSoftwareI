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

	public void realizarReserva(int codigoUsuario, int codigoLivro) {
		System.out.println("Iniciando procedimento de reserva...");

		Usuario usuario = BaseDeDados.obterInstancia().getUsuarioPorCodigo(codigoUsuario);

		if (usuario != null) {
			usuario.fazerReserva(codigoLivro);
			return;
		}

	}

	public void realizarEmprestimo(int codigoUsuario, int codigoLivro) {
		System.out.println("Iniciando procedimento de emprestimo");

		Usuario usuario = BaseDeDados.obterInstancia().getUsuarioPorCodigo(codigoUsuario);

		if (usuario != null) {
			usuario.fazerEmprestimo(codigoLivro);
			return;
		}

	}

	public void realizarDevolucao(int codigoUsuario, int codigoLivro) {
		System.out.println("Iniciando procedimento de devolucao...");

		Usuario usuario = BaseDeDados.obterInstancia().getUsuarioPorCodigo(codigoUsuario);

		if (usuario != null) {
			usuario.fazerDevolucao(codigoLivro);
			return;
		}

	}

	public void realizarObservacao(int codigoUsuario, int codigoLivro) {
		System.out.println("Iniciando procedimento de observação...");

		Usuario usuario = BaseDeDados.obterInstancia().getUsuarioPorCodigo(codigoUsuario);
		Livro livro = BaseDeDados.obterInstancia().getLivroPorCodigo(codigoLivro);

		if (usuario != null) {
			livro.registerObserver((Observer) usuario);
			return;
		}
	}

	public void realizarConsultaLivro(int codigoLivro) {
		System.out.println("Iniciando consulta de dados do livro...");
		BaseDeDados dados = BaseDeDados.obterInstancia();
		Livro livro = dados.getLivroPorCodigo(codigoLivro);
		Usuario usuario;

		System.out.println("Título: " + livro.getTitulo() + "\nQuantidade de Reservas: " + livro.getReservas().size());
		if (livro.getReservas().size() > 0) {
			System.out.println("-Reservas:");
			for (Reserva reserva : livro.getReservas()) {
				System.out.println("--Usuário: " + reserva.getUsuario().getNome());
			}
		}

		System.out.println();
		System.out.println("-Exemplares: ");
		for (Exemplar exemplar : livro.getExemplares()) {
			System.out.println();
			System.out.println(
					"--Código do exemplar: " + exemplar.getCodigoExemplar() + "\n--Status: " + exemplar.getStatus());
			if (exemplar.getStatus().equalsIgnoreCase("Emprestado")) {
				usuario = dados.getUsuarioPorCodigo(exemplar.getCodUsuarioEmPosse());
				System.out.println("--Usuário em posse: " + usuario.getNome());

				// percorre os emprestimos do usuario para achar qual corresponde livro do
				// exemplar
				for (Emprestimo emprestimo : usuario.getEmprestimos()) {
					if (emprestimo.getLivro().getCodigo() == exemplar.getCodigoLivro()) {
						System.out.println("--Data do emprestimo: " + emprestimo.getData() + "\n--Data de devolução: "
								+ emprestimo.getDataDeDevolução());
					}
				}
			}
		}

	}

	public void realizarConsultaUsuario(int codigoUsuario) {
		System.out.println("Iniciando consulta de dados do usuário...");
	}

	public void realizarConsultaProfessor(int codigoUsuario) {
		System.out.println("Iniciando consulta de notificações do professor...");
	}

}
