package com.example.demo.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class RolesDto {
    private String rolename;

    private UtilisateurDto utilisateur;
}
