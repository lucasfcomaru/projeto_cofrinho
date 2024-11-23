package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Cofrinho c = new Cofrinho();
		
		// menu principal
		
		while (true) {
			try {
				System.out.println("[1] - Adicionar moeda");
				System.out.println("[2] - Remover moeda");
				System.out.println("[3] - Listar moedas");
				System.out.println("[4] - Total");
				System.out.println("[0] - Sair");
				
				System.out.println("Digite uma opção: ");
				int respMenu = teclado.nextInt();
				
				// adicionar
				if (respMenu == 1) {
					while (true) {
						try {
							// submenu
							System.out.println("Escolha o tipo de moeda:");
							System.out.println("[1] - Real");
							System.out.println("[2] - Dólar");
							System.out.println("[3] - Euro");
							
							System.out.println(); // espaço em branco
							
							System.out.println("Digite o tipo da moeda");
							int tipoMoeda = teclado.nextInt();
							System.out.println("Digite o valor");
							double valorMoeda = teclado.nextDouble();
							
							// método para adicionar moedas
							c.adicionar(tipoMoeda, valorMoeda);	
							break; // sai do loop ao completar com sucesso
						} catch (InputMismatchException e) {
							System.out.println("Digite um valor válido!");
							teclado.nextLine(); // limpa o buffer de entrada 
						} catch (Exception e) {
							System.out.println("Ocorreu um erro inesperado!");
							teclado.nextLine(); // limpa o buffer de entrada
						}
					}				
				}
				// remover
				else if (respMenu == 2) {
					while(true) {
						try {
							System.out.println("Digite o ídice da moeda que deseja remover: ");
							int indexM = teclado.nextInt();
							c.remover(indexM);
							break; // sai do loop ao completar com sucesso
						} catch (InputMismatchException e) {
							System.out.println("Digite um valor válido!");
							teclado.nextLine(); // limpa o buffer de entrada
						} catch (Exception e) {
							System.out.println("Digite um valor válido!");
							teclado.nextLine(); // limpa o buffer de entrada
						}
					}
					
				}
				// listar
				else if (respMenu == 3) {
					System.out.println("LISTA DE MOEDAS");
					c.listagemMoedas();
				}
				// total
				else if (respMenu == 4) {
					// método para converter
					System.out.println("O total convetido em Reais é: R$" + c.totalConvertido());
				}
				// sair
				else if (respMenu == 0) {
					System.out.println("Encerrando o programa...");
					break;
				}
				else {
					System.out.println("Por favor, digite um número que exista no menu.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor válido!");
				teclado.nextLine(); // limpa o buffer de entrada
			} catch (Exception e) {
				System.out.println("Digite um valor válido!");
				teclado.nextLine(); // limpa o buffer de entrada
			}
			
			
		}
		
	}

}
