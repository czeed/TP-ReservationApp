/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.modele.RoleModele;
import java.util.List;

/**
 *
 * @author KhadimDaffe
 */
public interface RoleService {
    RoleModele create(RoleModele role);
    
    List<RoleModele> read();
    
    RoleModele update(Long id, RoleModele role);
    
    String delete(Long id);
}
