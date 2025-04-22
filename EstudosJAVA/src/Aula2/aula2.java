package Aula2;

public class aula2 {
	public static void main (String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.Modelo = "Bic";
		c1.carga = 70;
		c1.tampada = true;
		c1.ponta = 0.5f;
				
		c1.status();
		c1.destampar();
		c1.rabiscar();
		c1.escrever();
		
		Caneta c2 = new Caneta();
		c2.Modelo = "FaberCastle";
		c2.cor = "preta";
		c2.carga = 30;
		c2.tampada = false;
		c2.ponta = 1.0f;
		
		c2.status();
		c2.tampar();
		c2.rabiscar();
		c2.escrever();
	}
}	
