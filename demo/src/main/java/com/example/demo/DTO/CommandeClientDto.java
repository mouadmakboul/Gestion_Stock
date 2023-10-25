package com.example.demo.DTO;

import com.example.demo.Entities.ClientEntity;
import com.example.demo.Entities.LigneCommandeClientEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder

public class CommandeClientDto {

    private String code;


    private Instant dateCommande;


    private ClientDto Client;


    private List<LigneCommandeClientDto> ligneCommandeClients;
}
