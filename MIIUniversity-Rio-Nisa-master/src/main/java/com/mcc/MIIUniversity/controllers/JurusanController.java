/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Jurusan;
import com.mcc.MIIUniversity.repositories.JurusanRepository;
import com.mcc.MIIUniversity.services.JurusanService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Laila
 */
@Controller
public class JurusanController {

    @Autowired
    JurusanService jurusanService;

    @Autowired
    JurusanRepository jurusanRepository;

    @GetMapping("/jurusan")
    public String index(Model model) {
        model.addAttribute("jurusan", new Jurusan());
        model.addAttribute("jurusans", jurusanService.getAll());

        return "jurusan";
    }
@PostMapping("/jurusansave")
public String save(@Valid Jurusan jurusan){
    jurusanService.save(jurusan);
    
    return "redirect:/jurusan/";
    
    
}


@RequestMapping("/jurusandelete/{id}")
public String delete(@PathVariable String id){
    jurusanService.delete(id);
    return "redirect:/jurusan/";
    
}
@RequestMapping("/jurusan/{id}")
public String getById(Model model, @PathVariable("nama") String nama){
model.addAttribute("jurusan", jurusanService.getById(nama));
model.addAttribute("jurusans", jurusanService.getAll());
     return "index";
  }
}
