package com.example.demo.DTO;

import com.example.demo.Entities.AdresseEntity;
import com.example.demo.Entities.CategoryEntity;
import com.example.demo.Entities.ClientEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder

public class ClientDto {

    private Integer id;

    private String nom;


    private String prenom;


    private AdresseEntity adresse;


    private String photo;


    private String mail;


    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;

    public ClientDto fromEntity(ClientEntity client){
        if (client == null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(client.getAdresse())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }

    public ClientEntity toEntity(ClientDto clientDto){
        if (clientDto == null){
            return null;
        }
        ClientEntity client = new ClientEntity();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdresse(clientDto.getAdresse());
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());
        return client;
    }
}
