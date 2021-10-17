package app;

public class Exemplo01 {

	public static void main(String[] args) {
		DAOEstudante daoEstudante = new ImplementaDAOEstudante();
		
		Estudante e1 = new Estudante("Roberto",0);
		Estudante e2 = new Estudante("João",1);
		daoEstudante.addEstudante(e1);
		daoEstudante.addEstudante(e2);	

		//imprime estudantes
		for (Estudante estudante : daoEstudante.getAllEstudantes()) {
			System.out.println("Estudante: [Numero na lista : " + estudante.getNumLista() + ", Nome : " + estudante.getNome() + " ]");
		}

		//atualiza estudante
		Estudante estudante = daoEstudante.getAllEstudantes().get(0);
		estudante.setNome("Matheus");
		daoEstudante.updateEstudante(estudante);

		//pega e imprime estudante
		daoEstudante.getEstudante(0);
		System.out.println("Estudante: [Numero na lista : " + estudante.getNumLista() + ", Nome : " + estudante.getNome() + " ]");		
	}

}
