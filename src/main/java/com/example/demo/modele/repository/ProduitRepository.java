/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.modele.repository;

import com.example.demo.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KhadimDaffe
 */
public interface ProduitRepository extends JpaRepository<Produit,Long>{
    
}
