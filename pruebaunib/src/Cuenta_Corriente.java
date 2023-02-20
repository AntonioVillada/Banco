
public class Cuenta_Corriente {

	private String numero_duenta;
	private float saldo;

	public Cuenta_Corriente(String numero_cuenta,int saldo) {
		this.saldo = saldo;
		this.numero_duenta = numero_cuenta;
	}

	public String getNumero_duenta() {
		return numero_duenta;
	}

	public void setNumero_duenta(String numero_duenta) {
		this.numero_duenta = numero_duenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
