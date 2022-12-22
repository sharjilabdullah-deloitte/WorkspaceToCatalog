package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String by;
    private String direction;
}
