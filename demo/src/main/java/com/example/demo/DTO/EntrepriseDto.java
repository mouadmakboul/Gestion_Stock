package com.example.demo.DTO;

import com.example.demo.Entities.AdresseEntity;
import lombok.Builder;
import lombok.Data;



import java.util.List;
@Data
@Builder

public class EntrepriseDto {

    private Integer id;

    private String nom;


    private String description;


    private AdresseEntity adresse;


    private String codeFiscal;


    private String photo;


    private String email;


    private String numTel;


    private List<CommandeFournisseurDto> commandeFournisseurs;
}
