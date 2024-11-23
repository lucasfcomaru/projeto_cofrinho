package empresa;

public class Euro extends Moeda {
	private String nome;

	public Euro(double valor, String nome) {
		super(valor);
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String info() {
		String info = getNome() + " - " + getValor();
		return info;		
	}

	@Override
	public double converter() {
		return getValor() * 6;
	}
}
