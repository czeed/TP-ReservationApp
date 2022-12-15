/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.modele.Produit;
import com.example.demo.modele.RoleModele;
import com.example.demo.service.ProduitService;
import com.example.demo.service.RoleService;
import java.util.List;
import javax.management.relation.Role;
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
@RequestMapping("/role")
@AllArgsConstructor
public class RoleController {
    
    private final RoleService roleService;
    
    @PostMapping("/create")
    public RoleModele create(@RequestBody RoleModele role){
        return roleService.create(role);
    }
    
    @GetMapping
    public List<RoleModele> read(){
        return roleService.read();
    }
    
     @PutMapping("/update/{id}")
    public RoleModele update(@PathVariable Long id,@RequestBody RoleModele role){
        return roleService.update(id,role);
    }
    
     @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return roleService.delete(id);
    }
    
}

