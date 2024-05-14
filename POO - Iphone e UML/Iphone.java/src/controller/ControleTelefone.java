/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import apps.Navegador;
import apps.Reprodutor;
import apps.Telefone;


/**
 *
 * @author SAVIO VITOR ALVES
 */
public class ControleTelefone implements Reprodutor, Telefone, Navegador{
      
    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MUSICA!");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MUSICA PAUSADA!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("MUSICA SELECIONADA!");
    }

    @Override
    public void ligarTelefone() {
        System.out.println("INICIANDO CHAMADA!"); 
    }

    @Override
    public void atenderTelefone() {
        System.out.println("TELEFONE ATENDIDO!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO!");
    }

    @Override
    public void exibirPagina() {
         System.out.println("PAGINA EXIBIDA!");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("NOVA ABA ADICIONADA!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA!");
    }
      
}
