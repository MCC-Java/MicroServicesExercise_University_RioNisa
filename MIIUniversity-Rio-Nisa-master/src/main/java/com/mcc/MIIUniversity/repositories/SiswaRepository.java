/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.repositories;

import com.mcc.MIIUniversity.entities.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laila
 */

    @Repository
public interface SiswaRepository extends JpaRepository<Siswa, Integer>{
   
//    @Query("SELECT r FROM Region r WHERE r.name like %?1% or r.id like %?1% ")
//    public List<Region> search(String keyword);
//List<Region> findAllWithId(Specification<Region> spec);    
//}

}
