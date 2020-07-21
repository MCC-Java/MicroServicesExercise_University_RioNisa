/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.controllers;

import com.mcc.MIIUniversitywebservice.entities.Fakultas;
import com.mcc.MIIUniversitywebservice.services.FakultasRestService;
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
public class FakultasRestController {
    
    @Autowired
    FakultasRestService fakultasRestService;
    
    
    @GetMapping("")
public String index( Model model){
   model.addAttribute("fakultas", new Fakultas());
    model.addAttribute("fakultass", fakultasRestService.getAll());
   
    return "index";
}
@PostMapping("/save")
public String save(@Validated Fakultas fakultas){
    fakultasRestService.save(fakultas);
    
    return "redirect:/";
    
    
}
@GetMapping("/delete/{id}")
public String delete(@PathVariable String id){
    fakultasRestService.delete(id);
    return "redirect:/";
    
}
@GetMapping("{id}")
public String getById(Model model, @PathVariable("id") String id){
model.addAttribute("fakultas", fakultasRestService.getById(Integer.parseInt(id)));
model.addAttribute("fakultass", fakultasRestService.getAll());

     return "index";
    
  }

}

