/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bootcamp.app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author SAVIO VITOR ALVES
 */
public class Bootcamp {
    
    private String nome;
    private String descricao;
    private final LocalDate dataInical = LocalDate.now();
    private final LocalDate dataFinal = dataInical.plusDays(45);
    private Set<Dev> devsInscritos =  new HashSet<>();
    private Set<Conteudo> conteudos =  new LinkedHashSet<>();
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataInical
     */
    public LocalDate getDataInical() {
        return dataInical;
    }

    /**
     * @return the dataFinal
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * @return the devsInscritos
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * @param devsInscritos the devsInscritos to set
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    /**
     * @return the conteudos
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * @param conteudos the conteudos to set
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.descricao);
        hash = 29 * hash + Objects.hashCode(this.dataInical);
        hash = 29 * hash + Objects.hashCode(this.dataFinal);
        hash = 29 * hash + Objects.hashCode(this.devsInscritos);
        hash = 29 * hash + Objects.hashCode(this.conteudos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bootcamp other = (Bootcamp) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataInical, other.dataInical)) {
            return false;
        }
        if (!Objects.equals(this.dataFinal, other.dataFinal)) {
            return false;
        }
        if (!Objects.equals(this.devsInscritos, other.devsInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudos, other.conteudos);
    }
    
}
