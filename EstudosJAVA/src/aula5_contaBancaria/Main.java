package aula5_contaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setnunConta(1);
		p1.setDono("Danilo");
		p1.abrirConta("CC"); // Vai atribuir saldo 50
		p1.getStatus();
		
		p1.estadoAtual();
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setnunConta(333);
		p2.setDono("Bruna");
		p2.abrirConta("CP");  // Vai atribuir saldo 150
		p2.getStatus();
		
		p2.sacar(50);
	
		
		p2.estadoAtual();
	}
	
}
