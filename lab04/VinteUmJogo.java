/* Nome: Lucas Matos de Medeiros
 * Matricula: 113111435
 */
package lp2.lab04;
import java.util.*;
import p1.aplic.cartas.*;

public class VinteUmJogo {
	private static final int VINTE_UM = 21;
	private static Mao jogador1 = new Mao();
	private static Mao mao_mesa = new Mao();
	private static Baralho baralho = new Baralho();
	private static Scanner sc = new Scanner(System.in);
	private static String opcao;
	
	public static void main(String[] args){
		baralho.baralhar();
		do {
			jogada();	
		} while (NovoJogo());}
	private static void jogada(){
		
		jogador1.adicionar(baralho.pegaCarta());
		mao_mesa.adicionar(baralho.pegaCarta());
	    mao_valor();
	    
		while (jogador1.valor() < VINTE_UM && mao_mesa.valor() < VINTE_UM){
			if (baralho.númeroDeCartas() <= 2){
				System.out.println("Não há mais cartas");
			break;
			}
			System.out.print("Deseja terminar o jogo?");
			opcao= sc.nextLine();
			if (opcao.equals("t") || opcao.equals("T")){
				while(mao_mesa.valor() < 17){
					mao_mesa.adicionar(baralho.pegaCarta());
				}
				break;
			} else {
				jogador1.adicionar(baralho.pegaCarta());
				if (jogador1.valor() >= VINTE_UM){
					break;
				}
				mao_mesa.adicionar(baralho.pegaCarta());
				if (mao_mesa.valor() >= VINTE_UM){
					break;
				}
				mao_valor();
			}
		}
		if (baralho.númeroDeCartas() > 1){
			Vencedor();
		}
	}
	private static boolean NovoJogo(){
		System.out.print("Deseja Começar uma nova partida? (s- sim ou n- não) ");
		opcao = sc.nextLine();
		if (opcao.equals("s") || opcao.equals("S")){
			if (baralho.númeroDeCartas() <= 1){
				baralho = new Baralho();
			}
			jogador1 = new Mao();
			mao_mesa = new Mao();
		return true;
		}else{
		return false;}
	}
	private static void mao_valor(){
		System.out.println("A mão da mesa é:" + mao_mesa);
		System.out.println("O valor é:" + mao_mesa.valor());
		System.out.println("A mão do jogador é:" + jogador1);
		System.out.println("O valor é:" + jogador1.valor());
		System.out.println("Cartas restantes no baralho: "+ baralho.númeroDeCartas());
	}
	private static void Vencedor(){
		System.out.println();
		System.out.println("Resultado:");
		if (mao_mesa.valor() == VINTE_UM || jogador1.valor() == VINTE_UM ){		
			if (mao_mesa.valor() == VINTE_UM && jogador1.valor() == VINTE_UM){
                mao_valor();
				System.out.println("Houve empate.");							
			}else if (jogador1.valor() == VINTE_UM){  
                mao_valor();
				System.out.println("O Jogador1 é o vencedor.");
			}else if (mao_mesa.valor() == VINTE_UM){  
                mao_valor();
				System.out.println("A mesa é a vencedora.");												
			}
		} else if (mao_mesa.valor() > VINTE_UM || jogador1.valor() > VINTE_UM){ 
			if (jogador1.valor() > VINTE_UM){
                mao_valor();
				System.out.println("A mesa é a vencedora.");							
				System.out.println("O jogador1 estourou.");					
			}else {
                mao_valor();
				System.out.println("jogador1 é o Vencedor.");						
				System.out.println("A mesa estourou.");						
			}
		}  else if (jogador1.valor() < VINTE_UM && mao_mesa.valor() < VINTE_UM){ 		
			if (jogador1.valor() == mao_mesa.valor()){
				System.out.println("Vencedor é a mesa!");							
			} else if (jogador1.valor() > mao_mesa.valor()){
                mao_valor();
				System.out.println("Vencedor é o jogador!");	
			} else{
                mao_valor();
				System.out.println("Vencedor é a mesa!");													
			}
		}
	}
}