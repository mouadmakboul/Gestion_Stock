package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Entreprise")

public class EntrepriseEntity extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Embedded
    private AdresseEntity adresse;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "entreprise")
    private List<CommandeFournisseur> commandeFournisseurs;
}
