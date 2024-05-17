/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public abstract class ContaBancaria {

    /**
     * @return the numeroCanta
     */
    public int getNumeroCanta() {
        return numeroCanta;
    }

    /**
     * @param numeroCanta the numeroCanta to set
     */
    public void setNumeroCanta(int numeroCanta) {
        this.numeroCanta = numeroCanta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    private int numeroCanta;
    private double saldo;
    
    public ContaBancaria(int numeroConta,double saldo){
         this.numeroCanta = numeroConta;
         this.saldo = saldo;
    }
    private double valor;
    public void sacar(double valor){
       System.out.println("========PROCEDIMENTO DE SAQUE========");
       System.out.println("Saldo inicial: "+this.getSaldo());
       this.valor = valor;
       System.out.println("Valor de saque: "+this.valor);
       this.setSaldo(this.getSaldo()-this.valor);
       System.out.println("O saldo atual é: "+this.getSaldo());
   }
   public void depositar(double valor){
       System.out.println("========PROCEDIMENTO DE DEPOSITO========");
       System.out.println("Saldo inicial: "+this.getSaldo());
       this.valor = valor;
       System.out.println("Valor de saque: "+this.valor);
       this.setSaldo(this.getSaldo()+this.valor);
       System.out.println("O saldo atual é: "+this.getSaldo());
   }
   public void transferir(double valor, ContaBancaria conta){
       System.out.println("========PROCEDIMENTO DE TRANSFERENCIA========");
       System.out.println("Saldo inicial: "+this.getSaldo());
       this.sacar(valor);
       conta.depositar(valor);
       System.out.println("O Saldo atual da conta de origem: "+this.getSaldo());
       System.out.println("O Saldo atual da conta de destino é: "+conta.getSaldo());
   }
}

