package app;

import java.util.List;

public interface DAOEstudante {

	public List<Estudante> getAllEstudantes();
	public Estudante getEstudante(int numLista);
	public void updateEstudante(Estudante estudante);
	public void deleteEstudante(Estudante estudante);
	public void addEstudante(Estudante estudante);

}
