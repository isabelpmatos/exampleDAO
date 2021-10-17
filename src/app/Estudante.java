package app;

public class Estudante {

	private String nome;
	private int numLista;

	Estudante(String name, int numLista){
		this.nome = name;
		this.numLista = numLista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumLista() {
		return numLista;
	}

	public void setNumLista(int numLista) {
		this.numLista = numLista;
	}

}
