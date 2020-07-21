/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Siswa;
import com.mcc.MIIUniversity.repositories.SiswaRepository;
import com.mcc.MIIUniversity.services.SiswaService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Laila
 */
@RequestMapping("api/siswa")
@RestController
public class SiswaRestController {
    
     @Autowired
    SiswaService service;
  
    
@Autowired
    SiswaRepository siswaRepository;
    
    @GetMapping("")
public List<Siswa> getAll(){
   
    return service.getAll();
}
@PostMapping("siswasave")
public Siswa save(@Valid @RequestBody Siswa siswa){
         return service.save(siswa);
}
@GetMapping("/siswagetById/{id}")
@SuppressWarnings("empty-statement")
public Siswa getById(@PathVariable("id") Integer id){
    return service.getById((id));

    
}
@DeleteMapping("/siswadelete/{id}")
@SuppressWarnings("empty-statement")
public String delete(@PathVariable("id") Integer id){
service.delete(id);
return "Siswa" + id + "has been deleted";
    
  }
@PutMapping("/siswaupdate/{id}")
@SuppressWarnings("empty-statement")
public String update(@PathVariable("id") Integer id){
Siswa siswa =service.getById(id);
    service.save(siswa);
    return "Siswa" + id + "has been added";
}
}

