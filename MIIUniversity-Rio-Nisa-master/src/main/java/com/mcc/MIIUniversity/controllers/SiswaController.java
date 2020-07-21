/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.MIIUniversity.controllers;

import com.mcc.MIIUniversity.entities.Siswa;
import com.mcc.MIIUniversity.services.SiswaService;
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
public class SiswaController {
    @Autowired
    SiswaService siswaService;  
    
    /**
     * controller base url
     * @return view index
     */
    @GetMapping("/siswa")
    public String index(Model model ){
        model.addAttribute("siswa", new Siswa()); 
        model.addAttribute("psiswa", siswaService.getAll()); 
        return "siswaView";
    }  
    /**
     * controller menyimpan data dari index
     * @return view base url
     */ 
    @PostMapping("/siswa/save")
    public String save(@Valid Siswa siswa){
        siswaService.save(siswa);
        return "redirect:/siswa";
    } 
    @RequestMapping("/siswa/delete/{id}")
    public String deleteRegion(@PathVariable(name = "id") Integer id){
        siswaService.delete(id);
        return "redirect:/siswa";
    } 
}
