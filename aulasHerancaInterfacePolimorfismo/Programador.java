package p2.aulas20132;

public class Programador extends Funcionario{
	private double valorHora;
	private int horasTrabalhadas;
	private String linguagem;
	private static int cont;
	
	public Programador(String nome, String cpf, String matricula, double valorHora) throws Exception{
		super(nome, cpf, matricula);
		if(valorHora < 0){
			throw new Exception("Valor deve ser positivo");
		}
		this.valorHora = valorHora;
		linguagem = "java";
		cont++;
	}
	
	public Programador(String nome, String cpf, String matricula) throws Exception{
		this(nome, cpf, matricula, 20);
	}
	
	public static int contador(){
		return cont;
	}
	
	@Override
	public void imprimeBoasVindas() {
		System.out.println("Prepare-se para muita programacao em " + linguagem);
	}
	
	public static void imprimeDescricao(){
		System.out.println("Programador!");
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorDaHora(){
		return valorHora;
	}
	
	public void setValorDaHora(double novo){
		valorHora = novo;
	}
	
	@Override
	public double calculaPagamento() {
		return horasTrabalhadas*valorHora;
	}
	
	@Override
	public String toString() {
		return "nome: " + super.getNome() + " matricula: " + super.getMatricula();
	}

}
