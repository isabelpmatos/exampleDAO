package app;

import java.util.ArrayList;
import java.util.List;

public class ImplementaDAOEstudante implements DAOEstudante {

	//lista representa a base de dados
	List<Estudante> estudantes;

	public ImplementaDAOEstudante(){
		estudantes = new ArrayList<Estudante>();
	}
	
	@Override
	public void deleteEstudante(Estudante estudante) {
		estudantes.remove(estudante.getNumLista());
		System.out.println("\nEstudante: Item " + estudante.getNumLista() + " da lista, excluído da base de dados");
	}

	//pega lista da base de dados
	@Override
	public List<Estudante> getAllEstudantes() {
		return estudantes;
	}

	@Override
	public Estudante getEstudante(int numLista) {
		return estudantes.get(numLista);
	}

	@Override
	public void updateEstudante(Estudante estudante) {
		estudantes.get(estudante.getNumLista()).setNome(estudante.getNome());
		System.out.println("\nEstudante: Item " + estudante.getNumLista() + " da lista, atualizado na base de dados");
	}

	@Override
	public void addEstudante(Estudante estudante) {
		estudantes.add(estudante);
	}

}
