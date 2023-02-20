import java.sql.Date;

public class Transacciones {
	 private double valor;
	    private Date hora;
	    private String tipoTransaccion;
	    private Date fecha;
	    private String estado;

	    public Transacciones(double valor, String tipoTransaccion) {
	        this.valor = valor;
	        this.tipoTransaccion = tipoTransaccion;
	        this.hora = new Date(0);
	        this.fecha = new Date(0);
	        this.estado = "Pendiente";
	    }

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public Date getHora() {
			return hora;
		}

		public void setHora(Date hora) {
			this.hora = hora;
		}

		public String getTipoTransaccion() {
			return tipoTransaccion;
		}

		public void setTipoTransaccion(String tipoTransaccion) {
			this.tipoTransaccion = tipoTransaccion;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

}
