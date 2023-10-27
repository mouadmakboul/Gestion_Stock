package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Fournisseur")

public class FournisseurEntity extends AbstractEntity{
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private AdresseEntity adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
