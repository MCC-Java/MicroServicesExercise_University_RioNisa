/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Jurusan;
import com.mcc.MIIUniversity.repositories.JurusanRepository;
import com.mcc.MIIUniversity.services.JurusanService;
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
@RequestMapping("api/jurusan")
@RestController
public class JurusanRestController {
    
     @Autowired
    JurusanService service;
  
    
@Autowired
    JurusanRepository jurusanRepository;
    
    @GetMapping("")
public List<Jurusan> getAll(){
   
    return service.getAll();
}
@PostMapping("jurusansave")
public Jurusan save(@Valid @RequestBody Jurusan jurusan){
         return service.save(jurusan);
}
@GetMapping("/jurusangetById/{id}")
@SuppressWarnings("empty-statement")
public Jurusan getById(@PathVariable("id") String id){
    return service.getById((id));

    
}
@DeleteMapping("/jurusandelete/{id}")
@SuppressWarnings("empty-statement")
public String delete(@PathVariable("id") String id){
service.delete(id);
return "Jurusan" + id + "has been deleted";
    
  }
@PutMapping("/jurusanupdate/{id}")
@SuppressWarnings("empty-statement")
public String update(@PathVariable("id") String id){
Jurusan jurusan =service.getById(id);
    service.save(jurusan);
    return "Jurusan" + id + "has been added";
}
}

