package com.example.demo.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "LigneCommandeFournisseurEntity")


public class LigneCommandeFournisseurEntity extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private ArticleEntity article;


    @ManyToOne
    @JoinColumn(name = "idCommande")
    private CommandeFournisseur commandeFournisseurs;
}
