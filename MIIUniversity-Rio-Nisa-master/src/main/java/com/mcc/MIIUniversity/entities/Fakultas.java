/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laila
 */
@Entity
@Table(name = "fakultas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fakultas.findAll", query = "SELECT f FROM Fakultas f")
    , @NamedQuery(name = "Fakultas.findByNama", query = "SELECT f FROM Fakultas f WHERE f.nama = :nama")})
public class Fakultas implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "nama")
    private String nama;

    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "id")
    private String id;

    private static final long serialVersionUID = 1L;

    public Fakultas() {
    }

    public Fakultas(String nama) {
        this.nama = nama;
    }

    public Fakultas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof Fakultas)) {
            return false;
        }
        Fakultas other = (Fakultas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mcc.MIIUniversity.entities.Fakultas[ id=" + id + " ]";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
