package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(11, 55);
		Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
	}

}
