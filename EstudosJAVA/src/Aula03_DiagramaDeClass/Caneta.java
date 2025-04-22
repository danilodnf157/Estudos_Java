package Aula03_DiagramaDeClass;

public class Caneta {
	public String Modelo;  // criaçao do atributos 
	public String cor;
	private float ponta;
	protected boolean tampada;
	protected int carga;
	
	
	 public void status() {
		System.out.println("uma caneta de cor " + this.cor);
		System.out.println("ponta: " + this.ponta);
		System.out.println("ela esta tampada? " + this.tampada);
		System.out.println(" caneta de modelo: " + this.Modelo);
	}
	 public void rabiscar() {  // criaçao de metodos (void : sem retorno)
		if(this.tampada == true) {
			System.out.println("a caneta esta tampada, não posso rabiscar");
		} else {
			System.out.println("ja estou rabiscando");
		}
	}
	private void escrever() {
	if(this.tampada == false) {
	System.out.println("a caneta esta destampada, o que você quer escrever?");
	} else {
		System.out.println("caneta esta tampada não posso escrever.");
		}
	}
	public void pintar() {
		
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
	
}
