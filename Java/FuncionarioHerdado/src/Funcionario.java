
public class Funcionario {

	private String nome;
	private String CPF;
	private double salario;
	
	// Constructor 
	public Funcionario() {

	}
	
	// Metodos
	
	public double getbonificacao() {
		return this.salario + (this.salario * 0.3);
	}
	
	//get e sets
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
