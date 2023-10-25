package com.example.demo.DTO;

import com.example.demo.Entities.ArticleEntity;
import com.example.demo.Entities.TypeMvtStk;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.Instant;
@Data
@Builder

public class MvtStockDto {
    private ArticleEntity article;


    private Instant dateMvt;


    private TypeMvtStk typeMvt;



    private BigDecimal quantite;
}
