package com.example.demo.DTO;

import com.example.demo.Entities.CategoryEntity;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
@Builder
@Data

public class ArticleDto {

    private String codeArticle;


    private String Designation;


    private BigDecimal prixUnitaireHt;


    private BigDecimal tauxTVA;


    private BigDecimal prixUnitaireTtc;


    private String photo;



    private CategoryEntity Category;
}
