package lp2.labRevisao;

import java.util.ArrayList;



public class Contribuinte {
	private String nome;
	private int numero;
	private String bem_valor;
	private int valor;
	private float valortotalbens;
	private BemDeValor Valor  = new BemDeValor(bem_valor, valor);
	private ArrayList<Float> ValorTotal;
	
    public Contribuinte(String nome, int numero){
	this.nome = nome;
	this.numero = numero;
	ValorTotal = new ArrayList<Float>();
}
    public String getNome() {
    	return nome;
    }

    public int getNumero() {
    	return numero;
    }       
public void BensValor(){
	ValorTotal.add(Valor.getValor());
}    
public float ValorTotalBens(ArrayList<Float> ValorTotal){
	for (int i = 0; i < ValorTotal.size(); i++) {
		valortotalbens += ValorTotal.get(i);
	}
	return valortotalbens;
	
}



}
