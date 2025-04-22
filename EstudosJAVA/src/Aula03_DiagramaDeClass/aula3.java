package Aula03_DiagramaDeClass;

public class aula3 {
	public static void main (String[] args) {
		
		Caneta c1 = new Caneta();
		c1.Modelo = "Bic Cristal";
		c1.cor = "azul";
		c1.carga = 80;
		c1.tampada = true;
		c1.status();
		c1.rabiscar();
		
}
}
