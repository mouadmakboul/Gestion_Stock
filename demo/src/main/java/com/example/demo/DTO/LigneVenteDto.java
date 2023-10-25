package com.example.demo.DTO;

import com.example.demo.Entities.VenteEntity;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder

public class LigneVenteDto {
    private VenteEntity vente;

    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
