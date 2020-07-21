/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.services;

import com.mcc.MIIUniversity.entities.Fakultas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Laila
 */
public interface IFakultasService {
//       List<Fakultas> search(String keyword);
//    Optional<Fakultas>findById(int id);
//    public List<Fakultas> FindAll(){
//        FakultasRepository.findAll();
//    }

    public List<Fakultas> getAll();

    public void save(Fakultas fakultas);
 
}
