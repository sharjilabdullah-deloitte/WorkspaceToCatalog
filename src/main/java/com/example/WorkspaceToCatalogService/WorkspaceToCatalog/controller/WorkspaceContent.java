package com.example.WorkspaceToCatalogService.WorkspaceToCatalog.controller;

import com.example.WorkspaceToCatalogService.WorkspaceToCatalog.service.WorkspaceContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class WorkspaceContent {

    private final WorkspaceContentService workspaceContentService;

    @Autowired
    public WorkspaceContent(WorkspaceContentService workspaceContentService) {
        this.workspaceContentService = workspaceContentService;
    }
    @GetMapping ("/printFolder")
    public void printFolder() throws Exception{
        workspaceContentService.printFolderName();
    }

}
