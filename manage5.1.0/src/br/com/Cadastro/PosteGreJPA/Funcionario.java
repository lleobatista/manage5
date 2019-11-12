/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Cadastro.PosteGreJPA;

import br.com.Comprovante_end.Comprovante_end;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author igorb
 */
@Entity
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;  
    private String rg;
    private String nome;
    private String cpf;
    private String dataNasc;
    private String cartTrab;
    private String tituloEl;
    private String pis;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Comprovante_end comprovante_end;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCartTrab() {
        return cartTrab;
    }

    public void setCartTrab(String cartTrab) {
        this.cartTrab = cartTrab;
    }

    public String getTituloEl() {
        return tituloEl;
    }

    public void setTituloEl(String tituloEl) {
        this.tituloEl = tituloEl;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Comprovante_end getComprovante_end() {
        return comprovante_end;
    }

    public void setComprovante_end(Comprovante_end comprovante_end) {
        this.comprovante_end = comprovante_end;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.rg);
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.cpf);
        hash = 43 * hash + Objects.hashCode(this.dataNasc);
        hash = 43 * hash + Objects.hashCode(this.cartTrab);
        hash = 43 * hash + Objects.hashCode(this.tituloEl);
        hash = 43 * hash + Objects.hashCode(this.pis);
        hash = 43 * hash + Objects.hashCode(this.comprovante_end);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNasc, other.dataNasc)) {
            return false;
        }
        if (!Objects.equals(this.cartTrab, other.cartTrab)) {
            return false;
        }
        if (!Objects.equals(this.tituloEl, other.tituloEl)) {
            return false;
        }
        if (!Objects.equals(this.pis, other.pis)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.comprovante_end, other.comprovante_end)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return "br.com.Cadastro.PosteGreJPA.Funcionario[ id=" + id + " ]";
    }

    
}
