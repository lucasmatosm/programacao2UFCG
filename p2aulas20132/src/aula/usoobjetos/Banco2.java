package aula.usoobjetos;
import p1.aplic.banco.*;
import p1.aplic.geral.*;
//cria dois objetos Pessoa com nome e CPF:
// pessoa1 é Joao, com CPF 30914060506
// pessoa1 é Ana, com CPF 12345678901

//cria as duas contas,
// uma cujo titular é João e
// outra cujo titular é Ana

//solicite do usuário o valor a depositar na conta de Joao
//deposite este valor na conta de João

//solicite do usuário o valor a transferir de João para Ana
//transfira este valor da conta de João para a conta de Ana

//Fecha a agencia e guarde toda a informação em arquivo
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
