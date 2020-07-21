/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.repositories;

import com.mcc.MIIUniversity.entities.Fakultas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laila
 */

@Repository
public interface FakultasRepository extends JpaRepository<Fakultas, String>{
    
}
