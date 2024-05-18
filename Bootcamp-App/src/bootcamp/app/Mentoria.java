/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp.app;

import java.time.LocalDate;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class Mentoria extends Conteudo{
    
    private LocalDate data;
    
    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", curso=" + getDescricao() + ", data=" + data + '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
}
