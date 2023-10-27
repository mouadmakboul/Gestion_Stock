package com.example.demo.DTO;

import com.example.demo.Entities.ArticleEntity;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder

public class LigneCommandeFourniseurDto {

    private Integer id;

    private ArticleEntity article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private CommandeFournisseurDto commandeFournisseurs;
}
