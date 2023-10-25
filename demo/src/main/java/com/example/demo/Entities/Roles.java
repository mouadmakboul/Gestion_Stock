package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Roles")

public class Roles extends AbstractEntity{

    @Column(name = "rolename")
    private String rolename;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private UtilisateurEntity utilisateur;
}
