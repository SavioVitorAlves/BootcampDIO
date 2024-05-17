/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class Main {

    public static void main(String[] args) {
        ContaBancaria cp = new contaPoupanca(456321,3000.00);
        ContaBancaria cc = new contaCorrente(456321,8000.00);
        cp.depositar(1000);
        cc.sacar(2000);
        cc.transferir(1000, cp);
       
    }
}
