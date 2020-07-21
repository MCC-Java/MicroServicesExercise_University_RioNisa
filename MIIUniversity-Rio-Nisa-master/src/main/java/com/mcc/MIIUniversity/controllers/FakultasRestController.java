/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Fakultas;
import com.mcc.MIIUniversity.repositories.FakultasRepository;
import com.mcc.MIIUniversity.services.FakultasService;
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
@RequestMapping("api/fakultas")
@RestController
public class FakultasRestController {
    
     @Autowired
    FakultasService service;
  
    
@Autowired
    FakultasRepository fakultasRepository;
    
    @GetMapping("")
public List<Fakultas> getAll(){
   
    return service.getAll();
}
@PostMapping("save")
public Fakultas save(@Valid @RequestBody Fakultas fakultas){
         return service.save(fakultas);
}
@GetMapping("{id}")
@SuppressWarnings("empty-statement")
public Fakultas getById(@PathVariable("id") String id){
    return service.getById((id));

    
}
@DeleteMapping("{id}")
@SuppressWarnings("empty-statement")
public String delete(@PathVariable("id") String id){
service.delete(id);
return "Fakultas" + id + "has been deleted";
    
  }
@PutMapping("{id}")
@SuppressWarnings("empty-statement")
public String update(@PathVariable("id") String id){
Fakultas fakultas =service.getById(id);
    service.save(fakultas);
    return "Fakultas" + id + "has been added";
}
}

