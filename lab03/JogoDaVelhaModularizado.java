package lp2.lab03;
//Aluno: Lucas Matos de Medeiros
import java.util.Scanner;

public class JogoDaVelhaModularizado {
	private static char tabuleiro[][] = new char[3][3];
	private static final char O='O', X='X';
    private static int jogada=0,j,i, opcao;
    private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			formatabuleiro(i,j);
		    while(jogada<=9){
		    	if(joga(tabuleiro,i,j,O, X)== true){
		    		jogada++;} 
		        //Verifica se o vencedor foi o jogador 1
	            if (jogador1(tabuleiro, i)== true){
		        System.out.print("\nJogador 1, VOCE VENCEU!!!");
	            break;
	            }
	            //Verifica se o vencedor foi o jogador 2
		        if (jogador2(tabuleiro, i) == true){ 
		        System.out.print("\nJogador 2, VOCE VENCEU!!!");
	            break;}
		        //Verifica se houve empate
		        if (empatada(tabuleiro, jogada, i) == true){
		        System.out.print("\nPARTIDA EMPATADA");
	            break;}
		        }
		    System.out.println("\nPara jogar novamente digite 1, para sair digite 0");
		    opcao = sc.nextInt();
		    if (opcao == 0){
		    	break;
		    }
		    else{jogada = 0;}
		}
		sc.close();
	    }
	private static void formatabuleiro(int i, int j){

		for(i=0;i<3;i++)
	        for(j=0;j<3;j++)
	            tabuleiro[i][j]=' ';	
	}
	private static boolean joga(char tabulerio[][], int i, int j,char O, char X){
		System.out.print("  JOGO DA VELHA \n");
        for(i=0;i<3;i++)
        {
        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
            if(i<3-1)
            {
            	System.out.print("\n------\n");
            }
        }
        System.out.println("\nINSIRA AS COORDENADAS");
        if((jogada%2)==1)System.out.print("PLAYER 2\nLINHA: ");
        else System.out.print("PLAYER 1\nLINHA: ");

        i = sc.nextInt();
        System.out.print("COLUNA: ");
        j = sc.nextInt();

        if(tabuleiro[i-1][j-1]==' ')
        {
            if((jogada%2)==1)tabuleiro[i-1][j-1]=X;
            else tabuleiro[i-1][j-1]=O;
            return true;
        }
        return false;
	}
    private static boolean jogador1(char tabuleiro[][], int i){
		if((tabuleiro[0][0]==O && tabuleiro[0][1]==O && tabuleiro[0][2]==O)||
		           (tabuleiro[1][0]==O && tabuleiro[1][1]==O && tabuleiro[1][2]==O)||
		           (tabuleiro[2][0]==O && tabuleiro[2][1]==O && tabuleiro[2][2]==O)||
		           (tabuleiro[0][0]==O && tabuleiro[1][0]==O && tabuleiro[2][0]==O)||
		           (tabuleiro[0][1]==O && tabuleiro[1][1]==O && tabuleiro[2][1]==O)||
		           (tabuleiro[0][2]==O && tabuleiro[1][2]==O && tabuleiro[2][2]==O)||
		           (tabuleiro[0][0]==O && tabuleiro[1][1]==O && tabuleiro[2][2]==O)||
		           (tabuleiro[0][2]==O && tabuleiro[1][1]==O && tabuleiro[2][0]==O))
		        {
		        	for(i=0;i<3;i++)
			        {
			        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
			            if(i<3-1)
			            {
			            	System.out.print("\n------\n");
			            }
			        }
		        	return true;
		        }
		return false;
	}
    private static boolean jogador2(char tabuleiro[][], int i){
    	if((tabuleiro[0][0]==X && tabuleiro[0][1]==X && tabuleiro[0][2]==X)||
 	           (tabuleiro[1][0]==X && tabuleiro[1][1]==X && tabuleiro[1][2]==X)||
 	           (tabuleiro[2][0]==X && tabuleiro[2][1]==X && tabuleiro[2][2]==X)||
 	           (tabuleiro[0][0]==X && tabuleiro[1][0]==X && tabuleiro[2][0]==X)||
 	           (tabuleiro[0][1]==X && tabuleiro[1][1]==X && tabuleiro[2][1]==X)||
 	           (tabuleiro[0][2]==X && tabuleiro[1][2]==X && tabuleiro[2][2]==X)||
 	           (tabuleiro[0][0]==X && tabuleiro[1][1]==X && tabuleiro[2][2]==X)||
 	           (tabuleiro[0][2]==X && tabuleiro[1][1]==X && tabuleiro[2][0]==X))
 	        {
 	        	for(i=0;i<3;i++)
 		        {
 		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
 		            if(i<3-1)
 		            {
 		            	System.out.print("\n------\n");
 		            }
 		        }
 	        	return true;
 	        }
    	return false;
    }
    private static boolean empatada(char tabuleiro[][],  int jogada, int i){
    	 if(jogada==9)
	        {
	        	for(i=0;i<3;i++)
		        {
		        	System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
		            if(i<3-1)
		            {
		            	System.out.print("\n------\n");
		            }
		        }
	        	return true;
	        }
    	 return false;
    }
}
