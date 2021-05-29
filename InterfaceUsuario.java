package br.ufba.trabalho.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class InterfaceUsuario {

	private HashMap<String, Comando> comandos;

	private String obterComandoConsole() throws IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.println();
		System.out.println("Digite o comando: ");
		return teclado.readLine();
	}

	private void executarComando(String stringComando) {
		String[] stringComandoSeparado = stringComando.split(" ");
		
		String siglaDoComando = stringComandoSeparado[0];
		int codigo1 = Integer.parseInt(stringComandoSeparado[1]);
		int codigo2 = Integer.parseInt(stringComandoSeparado[2]);

		Comando comando = comandos.get(siglaDoComando);
		comando.executar(codigo1, codigo2);
	}

	public void fazerLoopEntrada() throws IOException {
		comandos = InicializadorComandos.inicializarComandos();

		String stringComando = obterComandoConsole();
		while (!stringComando.equals("sai")) {
			executarComando(stringComando);
			stringComando = obterComandoConsole();
		}
	}
}
