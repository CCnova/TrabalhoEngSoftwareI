package br.ufba.trabalho.biblioteca;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
	private Livro livro;
	private Date data;
	private Date dataDeDevolução;
	private Usuario usuario;
	private Calendar c = Calendar.getInstance();

	public Emprestimo(Usuario usuario, Livro livro, Date data) {
		this.usuario = usuario;
		this.livro = livro;
		this.data = data;
		
		c.setTime(data);
		c.add(Calendar.DATE, usuario.getDuracaoEmprestimoEmDias());
		this.dataDeDevolução = c.getTime();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataDeDevolução() {
		return dataDeDevolução;
	}

	public void setDataDeDevolução(Date dataDeDevolução) {
		this.dataDeDevolução = dataDeDevolução;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
