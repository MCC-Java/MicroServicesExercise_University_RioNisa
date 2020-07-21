/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.controllers;

import com.mcc.MIIUniversitywebservice.entities.Jurusan;
import com.mcc.MIIUniversitywebservice.services.JurusanRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Laila
 */
@Controller
public class JurusanRestController {
    
    @Autowired
    JurusanRestService jurusanRestService;
    
    
    @GetMapping("/jurusan")
public String index( Model model){
   model.addAttribute("jurusan", new Jurusan());
    model.addAttribute("jurusans", jurusanRestService.getAll());
   
    return "jurusan";
}
@PostMapping("/jurusansave")
public String save(@Validated Jurusan jurusan){
    jurusanRestService.save(jurusan);
    
    return "redirect:/jurusan";
    
    
}
@GetMapping("/jurusandelete/{id}")
public String delete(@PathVariable String id){
    jurusanRestService.delete(id);
    return "redirect:/jurusan";
    
}
@GetMapping("/jurusan/{id}")
public String getById(Model model, @PathVariable("id") String id){
model.addAttribute("jurusan", jurusanRestService.getById(Integer.parseInt(id)));
model.addAttribute("jurusans", jurusanRestService.getAll());

     return "jurusan";
    
  }

}

