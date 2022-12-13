package com.example.demo.contoler;

import com.example.demo.entity.Etudiant;
import com.example.demo.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EtudiantController {
    @Autowired EtudiantService etudiantService;
    @PostMapping("/new")
    public void addEtudiant(@RequestBody Etudiant p){
        etudiantService.saveEtudiant(p);
    }
    @GetMapping("/get/{id}")
    public Etudiant getEtudiantById(@PathVariable Long id){
        return etudiantService.getEtudiant(id);
    }
    @GetMapping("/getall")
    public List<Etudiant> getAllEtudiants(){
        return etudiantService.getAllEtudiant();
    }
    @DeleteMapping("/delete/{id}")
    public void delEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
    }
}
