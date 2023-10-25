package com.example.demo.DTO;

import com.example.demo.Entities.ArticleEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class LigneCommandeFourniseurDto {
    private ArticleEntity article;




    private CommandeFournisseurDto commandeFournisseurs;
}
