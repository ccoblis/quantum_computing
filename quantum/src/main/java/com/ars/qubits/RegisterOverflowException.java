package com.ars.qubits;

public class RegisterOverflowException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4071226864956577717L;

	public RegisterOverflowException(){
		super("Register size exceeded!");
	}
}
