/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.modele.Produit;
import java.util.List;

/**
 *
 * @author KhadimDaffe
 */
public interface ProduitService {
    
    Produit creer(Produit produit);
    
    List<Produit> lire();
    
    Produit modifier(Long id, Produit produit);
    
    String supprimer(Long id);
    
}
