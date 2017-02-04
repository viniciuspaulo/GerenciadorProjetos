/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gerenciador.MODEL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinicius
 */
@Entity
@Table(name = "tblempresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tblempresas.findAll", query = "SELECT t FROM Tblempresas t")
    , @NamedQuery(name = "Tblempresas.findById", query = "SELECT t FROM Tblempresas t WHERE t.id = :id")
    , @NamedQuery(name = "Tblempresas.findByNome", query = "SELECT t FROM Tblempresas t WHERE t.nome = :nome")
    , @NamedQuery(name = "Tblempresas.findByAtivo", query = "SELECT t FROM Tblempresas t WHERE t.ativo = :ativo")})
public class Tblempresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ativo")
    private boolean ativo;

    public Tblempresas() {
    }

    public Tblempresas(Integer id) {
        this.id = id;
    }

    public Tblempresas(Integer id, String nome, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tblempresas)) {
            return false;
        }
        Tblempresas other = (Tblempresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gerenciador.MODEL.Tblempresas[ id=" + id + " ]";
    }
    
}
