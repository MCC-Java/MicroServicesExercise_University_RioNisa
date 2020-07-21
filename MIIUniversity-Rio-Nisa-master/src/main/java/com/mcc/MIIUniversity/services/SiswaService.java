/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.services;

import com.mcc.MIIUniversity.entities.Siswa;
import com.mcc.MIIUniversity.repositories.SiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gin
 */
@Service
public class SiswaService {

    @Autowired
    SiswaRepository siswaRepository;

    public List<Siswa> getAll() {
        return siswaRepository.findAll();
    }

    public void delete(Integer id) {
       siswaRepository.delete(new Siswa(id));
    }

    public Siswa save(Siswa siswa) {
       return siswaRepository.save(siswa);

    }
     public Siswa getById(Integer id){
     return siswaRepository.findById(id).get();
 }


}
