package com.dio.santander.bankline.api.model;

import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	private Long numero;
	private double saldo;
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
