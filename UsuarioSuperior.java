package br.ufba.trabalho.biblioteca;

public abstract class UsuarioSuperior extends Usuario implements Observer {
	int vezesNotificado = 0;

	public UsuarioSuperior(int codigo, String nome) {
		super(codigo, nome);
	}

	public Object update(Livro livro) {
		vezesNotificado += 1;
		return null;
	}
}
