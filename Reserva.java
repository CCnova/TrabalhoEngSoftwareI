package br.ufba.trabalho.biblioteca;

public class Reserva {
	private Livro livro;
	private Usuario usuario;

	public Reserva(Livro livro, Usuario usuario) {
		this.livro = livro;
		this.setUsuario(usuario);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
