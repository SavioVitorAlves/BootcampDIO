/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bootcamp.app;

import java.time.LocalDate;
import java.util.Set;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class BootcampApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java Basico");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(10);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("javascrip");
        curso2.setDescricao("descrição do curso javascritp");
        curso2.setCargaHoraria(8);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria x");
        mentoria1.setDescricao("descrição da mentoria x");
        mentoria1.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos camila: "+ devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos camila: "+ devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos camila: "+ devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        
        
        System.out.println("--------");
        Dev devJoao = new Dev();
        devJoao.setNome("Camila");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos camila: "+ devJoao.getConteudoInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos camila: "+ devJoao.getConteudoInscritos());
        System.out.println("Conteudos concluidos camila: "+ devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
    
}
