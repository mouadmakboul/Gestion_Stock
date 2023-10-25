package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "LigneVenteEntity")

public class LigneVenteEntity extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name = "idVente")
    private VenteEntity vente;

    private BigDecimal quantite;
}
