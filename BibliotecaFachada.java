package br.ufba.trabalho.biblioteca;

public class BibliotecaFachada {
	private static BibliotecaFachada instancia;

	private BibliotecaFachada() {}
	
	public static BibliotecaFachada obterInstancia() {
		if(instancia == null) {
			instancia = new BibliotecaFachada();
		} 
		return instancia;
	}
	
	public void realizarEmprestimo() {
		System.out.println("Realizando Emprestimo");
		/*se usuario tem reserva feite pro livro, a reserva é excluida e o emprestimo efetivado.
		 *Ao final do procedimento o sistema deve emitir uma mensagem de sucesso ou insucesso, 
		 * que mencione o nome do usuário e o título do livro. Se for uma mensagem de insucesso, 
		 * ela deve também mencionar o motivo do insucesso.
		*/
	}
	
	public void realizarDevolucao() {
		System.out.println("Realizando Devolucao");
	}
	
	public void realizarReserva() {
		System.out.println("Realizando Reserva");
	}
	
	public void realizarConsultaLivro() {
		System.out.println("Consultando dados do livro");
	}
}
