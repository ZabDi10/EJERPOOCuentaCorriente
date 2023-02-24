package com.cursoceat.controler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Indique el nombre");
		String nombreString = new Scanner(System.in).nextLine();
		System.out.println("Indique el DNI");
		String dniString = new Scanner(System.in).nextLine();
		
		//Objeto 1 
		CuentaCorriente miCuenta = new CuentaCorriente(nombreString, dniString);
		
		//EL ingreso
		System.out.println("Cuanto quires ingresar");
		double miIngreso= new Scanner(System.in).nextDouble();
		miCuenta.ingreso(miIngreso);
		
		//Pregunto el banco
		System.out.print("Nombre del Banco >> ");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
		
		// El egreso
		System.out.println("Cuanto quires retirar");
		double miEgreso= new Scanner(System.in).nextDouble();
		miCuenta.egreso(miEgreso);
		Gestor miGestor1 = new Gestor("Antonio Gonzalez", "654896254");
		miCuenta.miGestor = miGestor1;
		
		//Mostramos la informacion
		miCuenta.mostrarInformacion();
		
		//Creo mi objeto 2 >> miCta2
		System.out.println("********Creo objeto 2 ********");
		System.out.print("Indique le DNI >> ");
		dniString = new Scanner(System.in).nextLine();
		
		System.out.print("Indique el saldo inicial al crear la cuenta >> ");
		Double saldoInicial = new Scanner(System.in).nextDouble();
		
		//Objeto 2
		CuentaCorriente miCuenta2 = new CuentaCorriente(dniString, saldoInicial);
		
		System.out.print("Indique el nombre >> ");
		miCuenta2.nombre = new Scanner(System.in).nextLine(); 
		
		Gestor miGestor2 =new Gestor("Beatriz Lopez", "626598741");
		miCuenta2.miGestor = miGestor2;
		
		System.out.print("Datos de la cuenta 1: ");
		miCuenta.mostrarInformacion();
		System.out.print("Datos de la cuenta 2: ");
		miCuenta2.mostrarInformacion();
		
		
		
		
		
	}

}
