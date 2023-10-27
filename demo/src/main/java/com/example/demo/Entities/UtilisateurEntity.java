package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "Utilisateur")

public class UtilisateurEntity extends AbstractEntity  {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motdepasse")
    private String motDePasse;

    @Embedded
    private AdresseEntity adresse;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private EntrepriseEntity entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;

}
