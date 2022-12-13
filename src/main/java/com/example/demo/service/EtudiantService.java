package com.example.demo.service;

import com.example.demo.entity.Etudiant;
import com.example.demo.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    @Autowired private EtudiantRepository etudiantRepository;
    public void saveEtudiant(Etudiant etudiant){
        etudiantRepository.save(etudiant);
    }
    public Etudiant getEtudiant(Long id){
        return etudiantRepository.findById(id).get();
    }
    public void deleteEtudiant(Long id){
        etudiantRepository.deleteById(id);
    }
    public List<Etudiant> getAllEtudiant(){
        return etudiantRepository.findAll();
    }
}
