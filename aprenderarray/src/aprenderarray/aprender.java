package aprenderarray;

public class aprender {
public static void main(String[] args) {
	int[] numeros = new int[10];
	int j=0, soma=0;
	for(int i=0; i < numeros.length; i++){
	numeros[i] = j;
	j++;
	System.out.print(numeros[i]);
	soma += numeros[i];
	}
	System.out.print(soma);
}
}
