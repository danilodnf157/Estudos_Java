package aula6_Encapsulamento;

public   class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;




	public ControleRemoto() {  //Constructor
		this.setVolume(50);
		this.setLigado(true);
		this.tocando = false;
}
	//metodos 




	private int getVolume() {
		return volume;
	}




	private  void setVolume(int volume) {
		this.volume = volume;
	}




	private  boolean isLigado() {
		return ligado;
	}




	private  void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
		
	private  boolean getTocando() {
		return tocando;
	}

	private  void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//metodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	@Override
	public void abrirMenu() {
		System.out.println("--------Menu--------");
		System.out.println("está ligado?" + this.isLigado());
		System.out.println("Está tocando?" + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i <= this.getVolume(); i += 10 ) {
			System.out.print(" | ");
		}
	}
	@Override
	public void fecharmenu() {
		System.out.println("Fechando Menu...");
	}
	@Override
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
	}
	@Override
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossìvel diminuir volume, tv está desligada");
		}
		
	}
	@Override
	public void lidarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}
	@Override
	public void play() {
		if(this.isLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}
	@Override
	public void pause() {
		if(this.isLigado() && getTocando()) {
			this.setTocando(false);
		}
		
	}
	
}
