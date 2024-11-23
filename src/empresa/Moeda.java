package empresa;

public abstract class Moeda {
	private double valor;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	// método criado para quando precisar pegar
	// valor, já que o atributo está privado
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract String getNome();
	public abstract void setNome(String nome);
	
	public abstract String info();
	
	public abstract double converter();
	
}
