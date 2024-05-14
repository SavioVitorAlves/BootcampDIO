/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;

//import com.saviovitoralves.iphone.sistema.apps.Navegador;

import apps.Navegador;
import apps.Reprodutor;
import apps.Telefone;
import controller.ControleTelefone;

//import com.saviovitoralves.iphone.sistema.apps.Reprodutor;
//import com.saviovitoralves.iphone.sistema.apps.Telefone;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class Iphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Instanciando a classe de implementação
       ControleTelefone cllr = new ControleTelefone();
       
       //Instanciando e atribuindo as interfaces as implemtações da classe implemntadora principal
       Telefone telefone = cllr;
       Reprodutor reprodutor = cllr;
       Navegador navegador = cllr;
       
       //Chamando os aplicativos do cllr
       //Telefone
       telefone.ligarTelefone();
       telefone.atenderTelefone();
       telefone.iniciarCorrerioVoz();
       
       //Reprodutor de Musica
       reprodutor.selecionarMusica();
       reprodutor.tocarMusica();
       reprodutor.pausarMusica();
       
       //Navegador de Internet
       navegador.adicionarNovaAba();
       navegador.exibirPagina();
       navegador.atualizarPagina();
    }
    
}
