package aula5_contaBancaria;

public class ContaBanco {
	public int nunConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status; //true conta aberta, false conta fechada 
	
	
	public void estadoAtual() {
		System.out.println("----------------------------------");
		System.out.println("Conta: " + this.getnunConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public ContaBanco() { //construtor 
		this.status= false;
		this.saldo = 0; 
	}
	// metodos da conta
	public void abrirConta(String t){
		this.setTipo(t);
		this.setStatus(true);
		if(t.equals("CC")) { // Use equals() para comparar Strings em Java
			this.setSaldo(50); // conta corrente começa com 50 reais 
		}else if (t.equals("CP")){
			this.setSaldo(150);// conta poupança começa com 150 reias
		}
	}
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("conta não pode ser fechado pois ainda há saldo.");
		}else if (this.getSaldo() < 0){
			System.out.println("conta em debito, pague o que deve antes.");
		}else {
			this.setStatus(false);
		}
	}
	public void depositar(float v) {
		if(this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada.");
		}
	}
	public void sacar(float valor) {
		if(this.getStatus() == true) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficente para saque");
			}
		}else {
			System.out.println("Impossivel sacar de uma conta fechada.");
		}
	}
	public void pagarMensal() {
		int v = 0;
		if(this.getTipo().equals("CC"))
 {
			v = 12;
		}else if(this.getTipo().equals("CP")) {
			v = 20;
		}if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - v); 
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar a mensalidade com uma conta fechada.");
		}
	}
	@SuppressWarnings("unused")
	private boolean status(){
		return status;
		
		
	}
	public int getnunConta() {
		return this.nunConta;
	}
	public void setnunConta(int n) {
		this.nunConta = n;
	}

	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
