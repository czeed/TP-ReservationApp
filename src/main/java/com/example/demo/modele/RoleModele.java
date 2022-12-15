/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author KhadimDaffe
 */

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
public class RoleModele {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idRole;
    @Column(length = 50)
    private String descriptionRole;
}
