package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedBy {
    private String id;
    private String name;
    private String email;
}
