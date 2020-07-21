/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.services;

import com.mcc.MIIUniversity.entities.Jurusan;
import com.mcc.MIIUniversity.repositories.JurusanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Laila
 */

@Service
public class JurusanService{
    
    @Autowired
    JurusanRepository jurusanRepository;
    
    //read
 public List<Jurusan> getAll(){
     return jurusanRepository.findAll();
 }
 //create/update
 public Jurusan save(Jurusan jurusan){
    return jurusanRepository.save(jurusan);
     
 }
 //delete
 public void delete (String id){
     jurusanRepository.deleteById(id);
 }
 public Jurusan getById(String id){
     return jurusanRepository.findById(id).get();
 }



   
}
