/* Aluno: Lucas Matos de Medeiros */
import java.util.Scanner;
public class MeuPrimeiroSistemaDeEleicao {
	private static int votos_brancos = 0, votos_nulos = 0, homem_ferro = 0, hulk = 0, thor = 0, voto = 0, eleitorado;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[]args){
		System.out.println("Informe a quantidade de eleitores do sistema:");
	    eleitorado = sc.nextInt();
		votacao(voto);
		relatorio(eleitorado,votos_brancos, votos_nulos, homem_ferro, hulk, thor);
		resultado(homem_ferro, thor, hulk);	
}
	private static void votacao(int num){
		for(int i = 0; i != eleitorado; i++){
			System.out.println("Informe seu voto (Homem de Ferro - 89, Thor – 27, Incrível Hulk – 68, Branco – 0, Nulo – 99) ou -1 para sair:");
			voto = sc.nextInt();
			if (voto == -1){
				break;}
				else{
					switch (voto) {
					case 89:
						homem_ferro++;
						break;
					case 27:
						thor++;
						break;
					case 68:
						hulk++;
						break;
					case 0:
						votos_brancos++;
						break;
					case 99:
						votos_nulos++;
						break;
					default:
						System.out.println("Opção errada");
						break;
				}
				}
			}
		}
 	private static void relatorio(int n1, int n2, int n3, int n4, int n5, int n6){
		System.out.println("Relatorio da eleicao");
		System.out.println("Total de votantes: "+ eleitorado);
		System.out.println("Votos brancos: " + votos_brancos);
		System.out.println("Votos nulos: " + votos_nulos);
		System.out.println("Votos Homem de Ferro: "+ homem_ferro);
		System.out.println("Votos Hulk: " + hulk);
		System.out.println("Votos Thor: " + thor);
		System.out.println("");
		System.out.println("");
	}
	private static void resultado(int n1, int n2, int n3){
		if ((homem_ferro > thor  && homem_ferro > hulk) || (thor > homem_ferro  && thor > hulk) || (hulk > homem_ferro  && hulk > thor)){
			if (homem_ferro > thor  && homem_ferro > hulk){
				System.out.println("O vencedor foi Homem de Ferro!");}
			if (thor > homem_ferro  && thor > hulk){
				System.out.println("O vencedor foi Thor!");}
			if (hulk > homem_ferro  && hulk > thor){
				System.out.println("O vencedor foi Hulk!");}
		}  
		else{
			if(homem_ferro == 0 && thor == 0 && hulk == 0){
				System.out.println("Nao houveram Votos");}
			else{System.out.println("Houve empate!");}
			}
	}
}