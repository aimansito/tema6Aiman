/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author aiman
 */
public class Cuenta {
    
    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.numeroCuenta = RandomStringUtils.random(20) ;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public Cuenta() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
    
}
