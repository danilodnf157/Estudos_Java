package Aula2;

public class Caneta {
	String Modelo;  // criaçao do atributos 
	String cor;
	float ponta;
	boolean tampada;
	int carga;
	
	
	void status() {
		System.out.println("uma caneta de cor " + this.cor);
		System.out.println("ponta: " + this.ponta);
		System.out.println("ela esta tampada? " + this.tampada);
		System.out.println(" caneta de modelo: " + this.Modelo);
	}
	void rabiscar() {  // criaçao de metodos (void : sem retorno)
		if(this.tampada == true) {
			System.out.println("a caneta esta tampada, não posso rabiscar");
		} else {
			System.out.println("ja estou rabiscando");
		}
	}
	void escrever() {
	if(this.tampada == false) {
	System.out.println("a caneta esta destampada, o que você quer escrever?");
	} else {
		System.out.println("caneta esta tampada não posso escrever.");
		}
	}
	void pintar() {
		
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
	
}
