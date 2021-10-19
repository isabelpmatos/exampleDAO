package app;

public class Exemplo01 {

	public static void main(String[] args) {
		DAOEstudante daoEstudante = new ImplementaDAOEstudante();
		
		Estudante e1 = new Estudante("Roberto",0);
		Estudante e2 = new Estudante("João",1);
		Estudante e3 = new Estudante("Julia",2);
		Estudante e4 = new Estudante("Daniella",3);
		daoEstudante.addEstudante(e1);
		daoEstudante.addEstudante(e2);	
		daoEstudante.addEstudante(e3);	
		daoEstudante.addEstudante(e4);	

		//imprime estudantes
		for (Estudante estudante : daoEstudante.getAllEstudantes()) {
			System.out.println("Estudante: [Numero na lista : " + estudante.getNumLista() + ", Nome : " + estudante.getNome() + " ]");
		}

		//atualiza estudante
		Estudante estudante = daoEstudante.getAllEstudantes().get(2);
		estudante.setNome("Matheus");
		daoEstudante.updateEstudante(estudante);
		
		//remove estudante
		daoEstudante.deleteEstudante(daoEstudante.getAllEstudantes().get(3));
		
		System.out.println("\nDepois da alteração:\n");

		//imprime estudantes
		for (Estudante e : daoEstudante.getAllEstudantes()) {
			System.out.println("Estudante: [Numero na lista : " + e.getNumLista() + ", Nome : " + e.getNome() + " ]");
		}		
	}

}
