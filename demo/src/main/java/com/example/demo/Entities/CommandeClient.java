package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "CommandeClient")

public class CommandeClient extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private ClientEntity Client;

    @OneToMany(mappedBy = "CommandeClient")
    private List<LigneCommandeClientEntity> ligneCommandeClients;
}
