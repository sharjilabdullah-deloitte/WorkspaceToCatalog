package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    private String id;
    private String name;
//    private long size ;
//    private String type;
//    private String format;
//    private Folder folder;
//
//    private String status;
//    private String description;
//    private List <Thumbnails> thumbnails;

    private String createdOn;

    private CreatedBy createdby;

    private String lastActivityOn;

    private Network network;
    private List<MetaData> metadata;
    private Stats stats;
    private int parentId;
    private WorkSpace workspace;
    private ParentFolder parentFolder;
    private boolean isTrashed;
    private String kind;
}