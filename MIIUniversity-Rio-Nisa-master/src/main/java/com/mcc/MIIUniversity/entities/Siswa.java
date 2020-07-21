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
 * @author Gin
 */
@Entity
@Table(name = "siswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siswa.findAll", query = "SELECT s FROM Siswa s")
    , @NamedQuery(name = "Siswa.findById", query = "SELECT s FROM Siswa s WHERE s.id = :id")
    , @NamedQuery(name = "Siswa.findByNis", query = "SELECT s FROM Siswa s WHERE s.nis = :nis")
    , @NamedQuery(name = "Siswa.findByNama", query = "SELECT s FROM Siswa s WHERE s.nama = :nama")
    , @NamedQuery(name = "Siswa.findByAsal", query = "SELECT s FROM Siswa s WHERE s.asal = :asal")
    , @NamedQuery(name = "Siswa.findByJurusan", query = "SELECT s FROM Siswa s WHERE s.jurusan = :jurusan")})
public class Siswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "nis")
    private Integer nis;
    @Size(max = 45)
    @Column(name = "nama")
    private String nama;
    @Size(max = 45)
    @Column(name = "asal")
    private String asal;
    @Size(max = 45)
    @Column(name = "jurusan")
    private String jurusan;

    public Siswa() {
    }

    public Siswa(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNis() {
        return nis;
    }

    public void setNis(Integer nis) {
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
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
        if (!(object instanceof Siswa)) {
            return false;
        }
        Siswa other = (Siswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mcc.MIIUniversity.entities.Siswa[ id=" + id + " ]";
    }
    
}
