import java.io.Serializable;

public class Hello_Cliente implements Serializable {
  
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Hello_Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	
}
