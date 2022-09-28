/*
 * Aluno: David Gilmour
 * Matrícula: 123456789
 */

package lp2.lab04;

import p1.aplic.cartas.*;

public class VinteUmSimples {

	private static final int VINTE_UM = 21;
	
	private static Mao jogador1;
	private static Mao jogador2;
	private static Baralho baralho;
	
	public static void main (String args[]) {
		
		jogador1 = new Mao();
		jogador2 = new Mao();
		baralho = new Baralho();
		
		baralho.baralhar();
		
		int ganhador = joga();
		
		if (ganhador < 0) {
			
			System.out.println("Valor da mao do Jogador 1: " + jogador1.valor());
			System.out.println("Valor da mao do Jogador 2: " + jogador2.valor());
			System.out.println("Nao houve ganhador!");
		} else if (ganhador == 0) {
			
			System.out.println("Valor da mao do Jogador 1: " + jogador1.valor());
			System.out.println("Valor da mao do Jogador 2: " + jogador2.valor());
			System.out.println("Empate");
		} else if (ganhador > 0) {
			
			System.out.println("Valor da mao do Jogador 1: " + jogador1.valor());
			System.out.println("Valor da mao do Jogador 2: " + jogador2.valor());
			System.out.println("O ganhado foi o Jogador " + ganhador);
		}
	}
	
	/**
	 * Joga uma versao bastante simplificada de vinte-um
	 * 
	 * @return O numero do jogador vencedor
	 */
	private static int joga() {
		
		while (true) {
			
			jogador1.adicionar(baralho.pegaCarta());
			jogador2.adicionar(baralho.pegaCarta());

			if (jogador1.valor() == VINTE_UM && jogador2.valor() == VINTE_UM) {
				
				return 0;
			} else if (jogador1.valor() <= VINTE_UM && jogador2.valor() > VINTE_UM) {
				
				return 1;
			} else if (jogador2.valor() <= VINTE_UM && jogador1.valor() > VINTE_UM) {
				
				return 2;
			} else if (jogador1.valor() > VINTE_UM && jogador2.valor() > VINTE_UM) {
				
				break;
			}
		}
		
		return -1;
	}
}
