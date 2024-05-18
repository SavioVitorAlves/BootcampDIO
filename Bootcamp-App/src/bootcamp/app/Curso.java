/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp.app;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class Curso extends Conteudo{
 
    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + ", curso=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + '}';
    } 
   
    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
}
