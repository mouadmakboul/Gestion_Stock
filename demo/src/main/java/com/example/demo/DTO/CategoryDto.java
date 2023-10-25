package com.example.demo.DTO;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder



public class CategoryDto {

    private String code;


    private String Designation;


    private List<ArticleDto> articles;
}
