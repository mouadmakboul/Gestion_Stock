package com.example.demo.DTO;

import com.example.demo.Entities.CategoryEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder



public class CategoryDto {

    private Integer id;

    private String code;


    private String designation;


    private List<ArticleDto> articles;

    //Category <- CategoryDto
    public CategoryDto fromEntity(CategoryEntity category){
        if (category == null){
            return null;
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public CategoryEntity toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return null;
        }
          CategoryEntity category = new CategoryEntity();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }
}
