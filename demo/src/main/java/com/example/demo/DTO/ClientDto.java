package com.example.demo.DTO;

import com.example.demo.Entities.AdresseEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder

public class ClientDto {

    private String nom;


    private String prenom;


    private AdresseEntity adresse;


    private String photo;


    private String mail;


    private String numTel;


    private List<CommandeClientDto> commandeClients;
}
