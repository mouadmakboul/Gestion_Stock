package com.example.demo.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "MvtStockEntity")

public class MvtStockEntity extends AbstractEntity {
    @ManyToOne
    @JoinColumn(name = "idArticle")
    private ArticleEntity article;

     @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;


    @Column(name = "quantite")
    private BigDecimal quantite;
}
