package com.test;

import java.io.Serializable;

public class Second implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2622226458910231195L;

	public void metodoNoConflict3() {
		;;;;;;;;;;
	} 
	public static void main(String ... args) {
		System.out.println("Metodo main");
	}
	public void metodoNoConflict() {
		;;;;;;;;;;
	}
	
	public String mike(String cheGhie) {
		;
		return cheGhie;
	}
	
	public String mike1(String cheGhie) {
		;
		return cheGhie;
	}
}