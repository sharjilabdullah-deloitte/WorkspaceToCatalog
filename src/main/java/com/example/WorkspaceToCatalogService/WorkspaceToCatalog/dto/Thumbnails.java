package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Thumbnails {
    private String type;
    private String location;
    private int size;
    private int width;
    private int height;
    private boolean isExternal;

    private Source source;
}
