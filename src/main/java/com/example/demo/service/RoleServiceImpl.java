/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.modele.Produit;
import com.example.demo.modele.RoleModele;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RoleRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author KhadimDaffe
 */
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    
    private final RoleRepository roleRepository;
   
    @Override
    public RoleModele create(RoleModele role) {
        return roleRepository.save(role); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<RoleModele> read() {
       return roleRepository.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RoleModele update(Long id, RoleModele role) {
        return roleRepository.findById(id)
                .map(p-> {
                p.setIdRole(role.getIdRole());
                p.setDescriptionRole(role.getDescriptionRole());
                return roleRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("produit non trouvé !"));  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(Long id) {
         roleRepository.deleteById(id);
        return "Produit supprimé";
    }
    
}

