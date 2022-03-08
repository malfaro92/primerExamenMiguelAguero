
package com.primerExamenMiguelAguero.controller;

import com.primerExamenMiguelAguero.entity.Concierto;
import com.primerExamenMiguelAguero.service.ConciertoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class indexController {
    
    @Autowired
    private ConciertoService conciertoService;
    
    
    @GetMapping({"/"})
    public String index(Model model){
       var conciertos = conciertoService.getConciertos();
                
        model.addAttribute("conciertos",conciertos);
        return "index";
    }
    
    @GetMapping("/nuevoConcierto")
    public String nuevoConcierto(Concierto concierto){
        return "modificarConcierto"; 
    }
    
    @PostMapping("/guardarConcierto")
    public String guardarConcierto(Concierto concierto){
        conciertoService.save(concierto);
        return "redirect:/";
    }
    
    @GetMapping("/modificarConcierto/{idconcierto}")
    public String modificarConcierto(Concierto concierto, Model model) {
        concierto = conciertoService.getConcierto(concierto);
        model.addAttribute("concierto",concierto);
        return "modificarConcierto";
    }
    
    @GetMapping("/eliminarConcierto/{idconcierto}")
    public String eliminarConcierto(Concierto concierto) {
        conciertoService.delete(concierto);
        return "redirect:/";
    } 
    
}
