/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversitywebservice.controllers;

import com.mcc.MIIUniversitywebservice.entities.Siswa;
import com.mcc.MIIUniversitywebservice.services.SiswaRestService;
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
public class SiswaRestController {
    
    @Autowired
    SiswaRestService siswaRestService;
    
    
    @GetMapping("/siswa")
public String index( Model model){
   model.addAttribute("siswa", new Siswa());
    model.addAttribute("siswas", siswaRestService.getAll());
   
    return "siswa";
}
@PostMapping("/siswasave")
public String save(@Validated Siswa siswa){
    siswaRestService.save(siswa);
    
    return "redirect:/siswa";
    
    
}
@GetMapping("/siswadelete/{id}")
public String delete(@PathVariable int id){
    siswaRestService.delete(id);
    return "redirect:/siswa";
    
}
@GetMapping("/siswa/{id}")
public String getById(Model model, @PathVariable("id") String id){
model.addAttribute("siswa", siswaRestService.getById(Integer.parseInt(id)));
model.addAttribute("siswas", siswaRestService.getAll());

     return "siswa";
    
  }

}

