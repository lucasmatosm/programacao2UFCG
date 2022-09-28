package lp2.lab06;

import java.util.Arrays;

/**
 * 
 * @author Filipe Coutinho
 * @version 1.0 08/12/2013
 *
 */




/* 
 * Aluno: Filipe Paulo Coutinho
 */

public class Sala {
	
	public static final String OCUPADO = "object";
	public static final String LIVRE = "livre";
	private int numLinhas, numColunas;
	private String[][] sala;
	
	public Sala(int linhas, int colunas) throws Exception{
		numLinhas = linhas;
		numColunas = colunas;
		if(numLinhas > 0 && numColunas > 0){
			sala = new String[numLinhas][numColunas];
		}else{
			throw new Exception("Parametros incorretos para a criacao da sala. As dimensoes da sala devem ser representadas por valores positivos maiores que zero");
		}
	}
	
	public int getNumPosicoesHorizontais(){
		return numLinhas;
	}
	
	public int getNumPosicoesVerticais(){
		return numColunas;
	}
	
	public boolean isVazia(){
		for (int i = 0; i < numLinhas; i++){
			for (int j = 0; j < numColunas; j++){
				if(sala[i][j] != null){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean inserirObstaculo(int linha, int coluna){
		if(posicaoValida(linha, coluna)){
			if((sala[linha][coluna] == null) || (sala[linha][coluna].equals(""))){
				sala[linha][coluna] = "X";
				return true;
			}
		}
		return false;
	}
	
	public boolean posicaoValida(int linha, int coluna){
		if((0 <= linha && linha < numLinhas) && (0 <= coluna && coluna < numColunas)){
			return true;
		}
		return false;
	}
	 
	public boolean isPosicaoLivre(int linha, int coluna) throws Exception{
		
		if(posicaoValida(linha, coluna) == false){
			throw new Exception("Posicao inexistente.");
		}
		
		if((sala[linha][coluna] == null) || (sala[linha][coluna].equals(""))){
			return true;
		}
		return false;
	}
	
	public boolean setPosicao(int linha, int coluna, Object status){
		if(posicaoValida(linha, coluna)){
			if(status == LIVRE){
				sala[linha][coluna] = "";
				return true;
			}else if (status == OCUPADO){
				sala[linha][coluna] = "X";
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		if (numColunas != other.numColunas)
			return false;
		if (numLinhas != other.numLinhas)
			return false;
		if (!Arrays.deepEquals(sala, other.sala))
			return false;
		return true;
	}
	
	
}
