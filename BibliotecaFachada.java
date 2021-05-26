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
