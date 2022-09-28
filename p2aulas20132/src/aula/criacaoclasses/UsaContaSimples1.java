package aula.criacaoclasses;

public class UsaContaSimples1 {
	public static void main(String[] args) {
		ContaSimples1 c = new ContaSimples1("livia", "123454577", 1);
		
		System.out.println("Saldo da conta: " + c.getSaldo());
		
		c.depositar(1000);
		
		System.out.println("Saldo da conta: " + c.getSaldo());
		
		System.out.println(c);
	}

}
