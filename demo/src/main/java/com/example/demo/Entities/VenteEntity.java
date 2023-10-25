package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "VenteEntity")

public class VenteEntity extends AbstractEntity{


    private String code;
}

