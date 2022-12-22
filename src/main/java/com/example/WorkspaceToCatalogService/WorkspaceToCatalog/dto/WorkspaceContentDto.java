package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkspaceContentDto {
    private int limit;
    private int offset;
    private int count;

    private Order order;
    private List <Kind> kind;   //Doubt
    private List <Items> items;

}
