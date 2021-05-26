package br.ufba.trabalho.biblioteca;

import java.util.HashMap;

public class InicializadorComandos {

	public static HashMap<String, Comando> inicializarComandos() {
		HashMap<String, Comando> comandos = new HashMap<String, Comando>();

		comandos.put("emp", new RealizarEmprestimo());
		comandos.put("res", new RealizarReserva());
		comandos.put("dev", new RealizarDevolucao());
		comandos.put("liv", new RealizarConsultaLivro());
		
		return comandos;
	}
}
