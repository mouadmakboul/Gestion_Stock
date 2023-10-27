package com.example.demo.DTO;

import com.example.demo.Entities.AdresseEntity;
import com.example.demo.Entities.CommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder

public class FournisseurDto {

    private Integer id;

    private String nom;


    private String prenom;


    private AdresseEntity adresse;


    private String photo;


    private String mail;


    private String numTel;


    private List<CommandeFournisseurDto> commandeFournisseurs;
}
