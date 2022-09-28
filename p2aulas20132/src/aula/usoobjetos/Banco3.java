package aula.usoobjetos;
import p1.aplic.banco.Agencia;
import p1.aplic.banco.ContaSimples;
import p1.aplic.banco.Extrato;
import p1.aplic.geral.Data;
import p1.io.Entrada;

public class Banco3 {
public static void main(String[] args) {
	ContaSimples c1 = (ContaSimples) Agencia.localizarConta(1);
	System.out.println(c1);
	
	double valor = Entrada.in.lerdouble("Digite o valor a sacar: ");
	c1.sacar(valor);
	//criar extrato
	Data ontem = new Data(19, 10, 2013);
	Data hoje = new Data();
	Extrato c2 = c1.criarExtrato(ontem, hoje);
	System.out.println(c2.formatar());
	System.out.println(c1.criarExtrato(ontem, hoje).formatar());
}
}
