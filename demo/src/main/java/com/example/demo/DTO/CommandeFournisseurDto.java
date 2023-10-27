package com.example.demo.DTO;

import com.example.demo.Entities.EntrepriseEntity;
import com.example.demo.Entities.FournisseurEntity;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;
@Data
@Builder

public class CommandeFournisseurDto {

    private Integer id;

    private String code;


    private Instant dateCommande;



    private FournisseurEntity fournisseur;


    private List<LigneCommandeFourniseurDto> ligneCommandeFournisseurs;


}
