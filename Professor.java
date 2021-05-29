package br.ufba.trabalho.biblioteca;

public class Professor extends Usuario implements Observer {
	int duracaoEmprestimoEmDias = 7;

	public Professor(int codigo, String nome) {
		super(codigo, nome);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
