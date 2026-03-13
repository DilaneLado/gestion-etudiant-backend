package com.example.gestion_etudiant_backend.controller;


import com.example.gestion_etudiant_backend.model.Etudiant;
import com.example.gestion_etudiant_backend.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
//@CrossOrigin("*")
public class EtudiantController {


    private final EtudiantService service;

    public EtudiantController(EtudiantService service) {
        this.service = service;
    }

    @GetMapping
    public List<Etudiant> getAll() {
        return service.getAllEtudiants();
    }

    @GetMapping("/{id}")
    public Etudiant getById(@PathVariable Long id) {
        return service.getEtudiantById(id);
    }

    @PostMapping
    public Etudiant create(@RequestBody Etudiant etudiant) {
        return service.saveEtudiant(etudiant);
    }

    @PutMapping("/{id}")
    public Etudiant update(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        etudiant.setId(id);
        return service.saveEtudiant(etudiant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteEtudiant(id);
    }
}
