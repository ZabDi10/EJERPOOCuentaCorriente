package com.cursoceat.controler;




public class Gestor {
	
	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	//  Constructores
	public Gestor(String nombreGestor, String telefono, double importeMax) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}

	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = 10000;
	}
	// Getter solo para consultar el telefono
	public String getTelefono() {
		return telefono;
	}
	//Metodos
	void mostrarInfoGestor() {
		System.out.println("Nombre >> "+this.nombreGestor+ "\nTelefono >> "+this.telefono+ "\nImporte Maximo >> "+this.importeMax+ "€");
	}
	
	
}
