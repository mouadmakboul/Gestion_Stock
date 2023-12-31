package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.apachecommons.CommonsLog;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Article")

public class ArticleEntity extends AbstractEntity{

    @Column(name = "CodeArticle")
    private String codeArticle;

    @Column(name = "Designation")
    private String Designation;

    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal tauxTVA;

    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private CategoryEntity Category;

    @OneToMany(mappedBy = "article")
    private List<LigneVenteEntity> ligneventes;

}
