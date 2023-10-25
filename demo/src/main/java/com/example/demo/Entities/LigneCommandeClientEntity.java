package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "LigneCommandeClientEntity")

public class LigneCommandeClientEntity extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "idCommandeClient")
    private CommandeClient CommandeClient;


    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;
}
