/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class contaCorrente extends ContaBancaria{
    
    public contaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }
    /*private double valor;
    
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
   }*/
}
