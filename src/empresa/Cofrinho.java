package empresa;

import java.util.ArrayList;

public class Cofrinho {
	// lista de moedas que vai armazenar todas as moedas
	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	
	public void adicionar(int tipo, double valor) {
		//1 = real, 2 = dolar, 3 = euro
		
		// verificação para saber qual tipo de moeda adicionar
		if(tipo == 1) {
			moedas.add(new Real( valor, "Real"));
			System.out.println("Moeda adicionada com sucesso.");
		}
		else if(tipo == 2) {
			moedas.add(new Dolar(valor, "Dólar"));
			System.out.println("Moeda adicionada com sucesso.");
		}
		else if(tipo == 3) {
			moedas.add(new Euro(valor, "Euro"));
			System.out.println("Moeda adicionada com sucesso.");
		}
		else {
			System.out.println("A moeda que está tentando adicionar não existe.");
			
		}
	}
	
	public void remover(int index) {
		//verifica se a lista está vazia
		if (moedas.isEmpty()) {
			System.out.println("A lista está vazia.");
			System.out.println(); // Linha em branco
			return;
		}
		
		// remoção da moeda através do índice
		// verificação para saber se o índice é válido
		if(index <= 0) {
			System.out.println("Índice inválido. Tente novamente.");
			System.out.println(); // Linha em branco
		}
		else if(index <= moedas.size()) {
			// ajuste feito tendo em vista que o usuário não sabe que
			// o índice começa do zero.
			moedas.remove(index - 1);
			System.out.println("Moeda deletada com sucesso.");
			System.out.println(); // Linha em branco
		}
		else {
			System.out.println("Índice inválido. Tente novamente.");
			System.out.println(); // Linha em branco
		}
	}
	
	public void listagemMoedas() {
		//verifica se a lista está vazia
		if (moedas.isEmpty()) {
			System.out.println("A lista está vazia.");
			System.out.println(); // Linha em branco
			return;
		}
		
		// contador para indicar o índice que o valor está
		// para facilitar quando o usuário desejar removê-lo
		int contador = 0;
		System.out.println("Índice - Moeda - Valor");
		for(Moeda m : moedas) {
			contador++;
			System.out.println("[" + contador + "] - " + m.info());
		}
		System.out.println(); // Linha em branco
	}

	public double totalConvertido() {
		//verifica se a lista está vazia
		if (moedas.isEmpty()) {
			System.out.println("A lista está vazia.");
			System.out.println(); // Linha em branco
			return 0;
		}
		else {
			double total = 0;
			for(Moeda m : moedas) {
				// incrementa o  valor retornado do método converter
				total += m.converter();
			}
			return total;
		}
		
		
	}

}
