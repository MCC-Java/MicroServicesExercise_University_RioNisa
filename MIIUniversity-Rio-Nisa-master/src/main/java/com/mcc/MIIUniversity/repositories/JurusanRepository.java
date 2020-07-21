/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.repositories;

import com.mcc.MIIUniversity.entities.Jurusan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laila
 */

    
    @Repository
public interface JurusanRepository extends JpaRepository<Jurusan, String>{
   

}
