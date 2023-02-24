package co.edu.uniquindio.unibanco.model;

import java.util.ArrayList;

public class Cliente {
	
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String email;
    private double saldo;

    public Cliente(String nombre, String apellidos, String cedula, String direccion, String email, Double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.saldo = saldo;
    } 


	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente("Juan", "Pérez", "12345678", "Calle 123", "juan@gmail.com", 1000.0));
        listaClientes.add(new Cliente("María", "González", "23456789", "Avenida 456", "maria@gmail.com", 5000.0));
        listaClientes.add(new Cliente("Pedro", "Sánchez", "34567890", "Plaza 789", "pedro@gmail.com", 2500.0));
        listaClientes.add(new Cliente("Lucía", "Martínez", "45678901", "Bulevar 012", "lucia@gmail.com", 1500.0));
        listaClientes.add(new Cliente("Jorge", "Fernández", "56789012", "Carrera 345", "jorge@gmail.com", 800.0));
}
}
