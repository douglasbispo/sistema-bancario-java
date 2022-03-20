package sistemaBancario;

public class Conta{

	private String nomeTitular;
	private int numero;
	private double saldo;
	private static int sequencia = 1;


	public Conta(String nomeTitular, double saldo, int numero) {
		super();
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static int getProximoNumero() {
		return sequencia++;
	}

	public boolean saque(double sacar) {
		if (this.saldo < sacar) {
			return false;
		} else {
			this.saldo = this.saldo - sacar;
			return true;
		}
	}

	public void Deposito(double deposito) {
		this.saldo += deposito;
	}

}
