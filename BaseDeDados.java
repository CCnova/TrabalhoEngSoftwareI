package br.ufba.trabalho.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseDeDados implements Subject {
	private static BaseDeDados instancia;
	private List<Usuario> usuarios;
	private List<Livro> livros;
	private List<Exemplar> exemplares;

	private BaseDeDados() {
	}

	public static BaseDeDados obterInstancia() {
		if (instancia == null) {
			instancia = new BaseDeDados();
			instancia.carregarDadosIniciais();
		}
		return instancia;
	}

	public void carregarDadosIniciais() {
		usuarios = new ArrayList<Usuario>();
		livros = new ArrayList<Livro>();
		exemplares = new ArrayList<Exemplar>();

		usuarios.add(new AlunoGraduacao(123, "João da Silva"));
		usuarios.add(new AlunoPosGraduacao(456, "Luiz Fernando Rodrigues"));
		usuarios.add(new AlunoGraduacao(789, "Pedro Paulo"));
		usuarios.add(new Professor(100, "Carlos Lucena"));

		livros.add(
				new Livro(100, "Engenharia de Software", "AddisonWesley", Arrays.asList("Ian Sommervile"), "6ª", 2000));
		livros.add(new Livro(101, "UML - Guia do Usuário", "Campus",
				Arrays.asList("Grady Booch", "James Rumbaugh", "Ivar Jacobson"), "7ª", 2000));
		livros.add(new Livro(200, "Code Complete", "Microsoft", Arrays.asList("Steve McConnell"), "2ª", 2014));
		livros.add(new Livro(201, "Agile Software Development Principles, Patterns and Practices", "Prentice Hall",
				Arrays.asList("Robert Martin"), "1ª", 2002));
		livros.add(new Livro(100, "Refactoring: Improving the Design of Existing Code", "Addison-Wesley Professional",
				Arrays.asList("Martin Fowler"), "1ª", 1999));
		livros.add(new Livro(100, "Software Metrics: A Rigorous and Practical Approach", "CRC Press",
				Arrays.asList("Norman Fenton", "James Bieman"), "3ª", 2014));
		livros.add(new Livro(100, "Design Patterns: Elements of Reusable Object-Oriented Software",
				"Addison-Wesley Professional",
				Arrays.asList("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides"), "1ª", 1994));
		livros.add(new Livro(100, "UML Distilled: A Brief Guide to the Standard Object Modeling Language",
				"Addison-Wesley Professional", Arrays.asList("Martin Fowler"), "3ª", 2003));

		exemplares.add(new Exemplar(100, 1, "Disponível"));
		exemplares.add(new Exemplar(100, 2, "Disponível"));
		exemplares.add(new Exemplar(101, 3, "Disponível"));
		exemplares.add(new Exemplar(200, 4, "Disponível"));
		exemplares.add(new Exemplar(201, 5, "Disponível"));
		exemplares.add(new Exemplar(300, 6, "Disponível"));
		exemplares.add(new Exemplar(300, 7, "Disponível"));
		exemplares.add(new Exemplar(400, 8, "Disponível"));
		exemplares.add(new Exemplar(400, 9, "Disponível"));

		for (Livro livro : livros) {
			for (Exemplar exemplar : exemplares) {
				if (livro.getCodigo() == exemplar.getCodigoLivro()) {
					livro.getExemplares().add(exemplar);
				}
			}
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public Usuario getUsuarioPorCodigo(int codigoUsuario) {
		for (Usuario usuario : usuarios) {
			if (usuario.getCodigo() == codigoUsuario) {
				return usuario;
			}
		}
		System.out.println("Usuario não encontrado.");
		return null;
	}

	public Livro getLivroPorCodigo(int codigoLivro) {
		for (Livro livro : livros) {
			if (livro.getCodigo() == codigoLivro) {
				return livro;
			}
		}
		System.out.println("Livro não encontrado.");
		return null;
	}

	public boolean existeExemplarDoLivro(int codigoLivro) {
		Livro livro = getLivroPorCodigo(codigoLivro);
		boolean existeExemplar = !livro.getExemplares().isEmpty();
		return existeExemplar;
	}

	public boolean existeExemplarDisponivel(int codigoLivro) {
		Livro livro = getLivroPorCodigo(codigoLivro);
		for (Exemplar exemplar : livro.getExemplares()) {
			if (exemplar.getStatus().equals("Disponível")) {
				System.out.println("Existe pelo menos um exemplar disponível.");
				return true;
			}
		}
		return false;
	}

	public boolean checarUsuarioDevedor(int codigoUsuario) {
		Usuario usuario = getUsuarioPorCodigo(codigoUsuario);
		return usuario.isDevedor();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
