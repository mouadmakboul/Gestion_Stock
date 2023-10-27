package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Category")

public class CategoryEntity extends AbstractEntity {


    @Column(name = "code")
    private String code;

    @Column(name = "designation")
    private String designation;

    @OneToMany(mappedBy = "Category")
    private List<ArticleEntity> articles;




}
