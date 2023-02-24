package com.cursoceat.controler;

public class CuentaCorriente {
	
	Gestor  miGestor;
	public String nombre;
	String dni;
	private double saldo;
	
	static private String nombreBanco = "International Java Bank";

	
	
	
	// Metodos Get and Set
	public static String getNombreBanco() {
		return nombreBanco;
	}

	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}

	// Metodo constructor
	public CuentaCorriente(String nombre, String dni) {

		this.nombre = nombre;
		this.dni = dni;

	}

	public CuentaCorriente(String dni, double saldo) {

		this.dni = dni;
		this.saldo = saldo;

	}

	public CuentaCorriente(String nombre, String dni, double saldo) {

		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public void setMiGestor(Gestor miGestor) {
		this.miGestor = miGestor;
	}

	//Los metodos
	boolean egreso(double cant) {
		boolean operacionPosible;
		if (saldo >= cant) {
			saldo -= cant;
			operacionPosible = true;
		} else {
			System.out.println("No hay dinero suficiente");
			operacionPosible = false;
		}

		return operacionPosible;
	}

	void ingreso(double cant) {
		saldo += cant;
		System.out.println("Tú nuevo saldo es >> "+saldo);
	}

	void mostrarInformacion() {
		if (miGestor == null) { // la cuenta no tiene gestor asignado
			System.out.println("Cuenta sin Gestor");
		}else {
			System.err.println("Informacion del Gestor");
			miGestor.mostrarInfoGestor();
		}
//		mostramos informacion de la cta
		System.out.println("*** Informacion de la cuenta ***");
		System.out.println("Nombre >> \t"+nombre);
		System.out.println("Dni >>    \t"+dni);
		System.out.println("Saldo >>  \t"+saldo+ "€");
		System.out.println("Banco >>  \t"+nombreBanco);
	}
	
	
}