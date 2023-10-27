package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "CommandeFournisseur")

public class CommandeFournisseur extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateCommande")
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private FournisseurEntity fournisseur;

    @OneToMany(mappedBy = "commandeFournisseurs")
    private List<LigneCommandeFournisseurEntity> ligneCommandeFournisseurs;

    @ManyToOne
    private EntrepriseEntity entreprise;
}
