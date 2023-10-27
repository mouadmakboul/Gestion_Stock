package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "LigneVenteEntity")

public class LigneVenteEntity extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name = "idVente")
    private VenteEntity vente;


    @Column(name = "quantite")
    private BigDecimal quantite;


    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private ArticleEntity article;
}
