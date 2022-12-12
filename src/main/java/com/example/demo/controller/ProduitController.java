/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.modele.Produit;
import com.example.demo.service.ProduitService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KhadimDaffe
 */
@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    
    private final ProduitService produitService;
    
    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }
    
    @GetMapping
    public List<Produit> read(Produit produit){
        return produitService.lire();
    }
    
     @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id,@RequestBody Produit produit){
        return produitService.modifier(id,produit);
    }
    
     @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
    
}
