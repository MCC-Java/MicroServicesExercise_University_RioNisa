/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.entities;

/**
 *
 * @author Laila
 */
public class Siswa {
   private int id;
   private int nis;
   private String nama;
   private String asal;
   private String jurusan;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nis
     */
    public int getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(int nis) {
        this.nis = nis;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
   
}
