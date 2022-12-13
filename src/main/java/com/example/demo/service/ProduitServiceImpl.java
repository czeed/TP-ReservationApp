/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.modele.Produit;
import com.example.demo.repository.ProduitRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author KhadimDaffe
 */
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {
    
    private final ProduitRepository produitRepository;

    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Produit> lire() {
        return produitRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p-> {
                p.setPrix(produit.getPrix());
                p.setNom(produit.getNom());
                p.setDescriptionProduit(produit.getDescriptionProduit());
                return produitRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("produit non trouvé !")); 
    }

    @Override
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimé";
    }
    
}
