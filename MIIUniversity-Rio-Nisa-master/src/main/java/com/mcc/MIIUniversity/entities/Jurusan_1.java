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
@Table(name = "jurusan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jurusan_1.findAll", query = "SELECT j FROM Jurusan_1 j")
    , @NamedQuery(name = "Jurusan_1.findById", query = "SELECT j FROM Jurusan_1 j WHERE j.id = :id")
    , @NamedQuery(name = "Jurusan_1.findByNama", query = "SELECT j FROM Jurusan_1 j WHERE j.nama = :nama")})
public class Jurusan_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nama")
    private String nama;

    public Jurusan_1() {
    }

    public Jurusan_1(String id) {
        this.id = id;
    }

    public Jurusan_1(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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
        if (!(object instanceof Jurusan_1)) {
            return false;
        }
        Jurusan_1 other = (Jurusan_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mcc.MIIUniversity.entities.Jurusan_1[ id=" + id + " ]";
    }
    
}
