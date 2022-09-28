package aula.usoobjetos;
import p1.aplic.banco.*;
import p1.aplic.geral.*;
//cria dois objetos Pessoa com nome e CPF:
// pessoa1 � Joao, com CPF 30914060506
// pessoa1 � Ana, com CPF 12345678901

//cria as duas contas,
// uma cujo titular � Jo�o e
// outra cujo titular � Ana

//solicite do usu�rio o valor a depositar na conta de Joao
//deposite este valor na conta de Jo�o

//solicite do usu�rio o valor a transferir de Jo�o para Ana
//transfira este valor da conta de Jo�o para a conta de Ana

//Fecha a agencia e guarde toda a informa��o em arquivo
public class Banco2 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Joao", "30914060506");
		Pessoa pessoa2 = new Pessoa("Ana", "30914060502");
		ContaSimples umaConta1 = new ContaSimples(pessoa1, 1);
		ContaSimples umaConta2 = new ContaSimples(pessoa2, 1);
		double valor = 1000;
		umaConta1.depositar(valor);
		System.out.println(umaConta1);
		valor = 500;
		umaConta1.transferir(umaConta2, valor);
		System.out.println(umaConta1);
		System.out.println(umaConta2);
		Agencia.fecharCaixa();
	}
	

}
