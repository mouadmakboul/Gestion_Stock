package com.example.demo.DTO;

import com.example.demo.Entities.AdresseEntity;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder

public class UtilisateurDto {
    private String nom;


    private String prenom;


    private String email;


    private Instant dateDeNaissance;


    private String motDePasse;


    private AdresseEntity adresse;


    private String photo;



    private EntrepriseDto entreprise;


    private List<RolesDto> roles;
}
