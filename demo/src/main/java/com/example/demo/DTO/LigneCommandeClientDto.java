package com.example.demo.DTO;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder

public class LigneCommandeClientDto {


    private ArticleDto article;



    private CommandeClientDto CommandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
