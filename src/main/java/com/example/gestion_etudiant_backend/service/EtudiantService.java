package com.example.gestion_etudiant_backend.service;


import com.example.gestion_etudiant_backend.model.Etudiant;
import com.example.gestion_etudiant_backend.repository.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    private final EtudiantRepository repository;

    public EtudiantService(EtudiantRepository repository) {
        this.repository = repository;
    }

    public List<Etudiant> getAllEtudiants() {
        return repository.findAll();
    }

    public Etudiant getEtudiantById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Etudiant saveEtudiant(Etudiant etudiant) {
        return repository.save(etudiant);
    }

    public void deleteEtudiant(Long id) {
        repository.deleteById(id);
    }
}
