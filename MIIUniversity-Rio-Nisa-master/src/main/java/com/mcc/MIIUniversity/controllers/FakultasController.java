/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Fakultas;
import com.mcc.MIIUniversity.repositories.FakultasRepository;
import com.mcc.MIIUniversity.services.FakultasService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Laila
 */
@Controller
public class FakultasController {
    @Autowired
    FakultasService fakultasService;
    
    
@Autowired
    FakultasRepository fakultasRepository;
    
    @GetMapping("")
public String index( Model model){
   model.addAttribute("fakultas", new Fakultas());
    model.addAttribute("fakultass", fakultasService.getAll());
   
    return "index";
}
@PostMapping("/save")
public String save(@Valid Fakultas fakultas){
    fakultasService.save(fakultas);
    
    return "redirect:/";
    
    
}


@RequestMapping("/delete/{id}")
public String delete(@PathVariable String id){
    fakultasService.delete(id);
    return "redirect:/";
    
}
@RequestMapping("{id}")
public String getById(Model model, @PathVariable("nama") String nama){
model.addAttribute("fakultas", fakultasService.getById(nama));
model.addAttribute("fakultass", fakultasService.getAll());
     return "index";
    
  }
//@PostMapping("/createIssue")
//public String creerUneDemande(@Valid @ModelAttribute("ecran") Ecran ecran, BindingResult result,
//        RedirectAttributes redirectAttributes) {
//
//
////if everything working fine then set the flag value
//redirectAttributes.addFlashAttribute("flag","showAlert");
//}
}
