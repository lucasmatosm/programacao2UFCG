package aula.usoobjetos;
import p1.aplic.banco.*;
//Programa Banco1
//Abra uma conta de n�mero 1 para Jo�o com CPF 309140605-06
//A conta ser� "referenciada" com a vari�vel umaConta
//Nesta conta, deposite R$1000,00
//Imprima o saldo da conta de Jo�o
//Saque R$300,00 desta conta
//Imprima o objeto umaConta
//Imprima o saldo da conta de Jo�o
public class Banco1 {
public static void main(String[] args) {
	ContaSimples umaConta = new ContaSimples("Jo�o", "309140605-06", 1);
	umaConta.depositar(1000);
	System.out.println("Saldo agora: " + umaConta.getSaldo());
	if(umaConta.sacar(1300)){
		System.out.println("Saque bem sucedido");
	}else{
		System.out.println("Seu saque nao deu certo!");
	}
	System.out.println("Saldo agora: " + umaConta.getSaldo());
	System.out.println(umaConta);
	ContaSimples umaConta2 = new ContaSimples("Livia", "309140605-06", 1);
	umaConta2.depositar(2000);
	umaConta2 = umaConta;
}
}
