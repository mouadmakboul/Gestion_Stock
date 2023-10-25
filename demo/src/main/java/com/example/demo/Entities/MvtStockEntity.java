package com.example.demo.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

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
}
