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
    
}
